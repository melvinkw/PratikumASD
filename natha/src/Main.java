import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] students = {
                new Student("22001", "Andi", "Teknik Informatika"),
                new Student("22002", "Budi", "Teknik Informatika"),
                new Student("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Book[] books = {
                new Book("B001", "Algoritma", 2020),
                new Book("B002", "Basis Data", 2019),
                new Book("B003", "Pemrograman", 2021),
                new Book("B004", "Fisika", 2024)
        };

        Loan[] loans = {
                new Loan(students[0], books[0], 7),
                new Loan(students[1], books[1], 3),
                new Loan(students[2], books[2], 10),
                new Loan(students[2], books[3], 6),
                new Loan(students[0], books[1], 4)
        };

        int choice;
        do {
            printMenu();
            System.out.print("Select: ");
            choice = input.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    displayStudents(students);
                    break;
                case 2:
                    displayBooks(books);
                    break;
                case 3:
                    displayLoans(loans);
                    break;
                case 4:
                    sortLoansByFineDescending(loans);
                    System.out.println("After sorting (Largest fine):");
                    displayLoans(loans);
                    break;
                case 5:
                    System.out.print("Enter NIM: ");
                    String nim = input.next();
                    searchLoanByNim(loans, nim);
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        } while (choice != 0);

        input.close();
    }

    private static void printMenu() {
        System.out.println("=== JTI LIBRARY BORROWING SYSTEM ===");
        System.out.println("1. Display Students");
        System.out.println("2. Display Books");
        System.out.println("3. Display Borrowings");
        System.out.println("4. Sort by Fines");
        System.out.println("5. Search by Student ID");
        System.out.println("0. Exit");
    }

    private static void displayStudents(Student[] students) {
        System.out.println("Student List:");
        for (Student student : students) {
            student.printStudent();
        }
    }

    private static void displayBooks(Book[] books) {
        System.out.println("Book List:");
        for (Book book : books) {
            book.printBook();
        }
    }

    private static void displayLoans(Loan[] loans) {
        System.out.println("Loan Data:");
        for (Loan loan : loans) {
            loan.printLoan();
        }
    }

    private static void sortLoansByFineDescending(Loan[] loans) {
        for (int i = 1; i < loans.length; i++) {
            Loan temp = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].getFine() < temp.getFine()) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = temp;
        }
    }

    private static void searchLoanByNim(Loan[] loans, String nim) {
        Loan[] tempLoans = copyLoans(loans);
        sortLoansByNim(tempLoans);

        int index = binarySearchByNim(tempLoans, nim);
        if (index == -1) {
            System.out.println("Data not found.");
            return;
        }

        int left = index;
        while (left - 1 >= 0 && tempLoans[left - 1].getStudent().getNim().equals(nim)) {
            left--;
        }

        int right = index;
        while (right + 1 < tempLoans.length && tempLoans[right + 1].getStudent().getNim().equals(nim)) {
            right++;
        }

        for (int i = left; i <= right; i++) {
            tempLoans[i].printLoan();
        }
    }

    private static Loan[] copyLoans(Loan[] loans) {
        Loan[] copy = new Loan[loans.length];
        for (int i = 0; i < loans.length; i++) {
            copy[i] = loans[i];
        }
        return copy;
    }

    private static void sortLoansByNim(Loan[] loans) {
        for (int i = 1; i < loans.length; i++) {
            Loan temp = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].getStudent().getNim().compareTo(temp.getStudent().getNim()) > 0) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = temp;
        }
    }

    private static int binarySearchByNim(Loan[] loans, String nim) {
        int left = 0;
        int right = loans.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midNim = loans[mid].getStudent().getNim();

            if (midNim.equals(nim)) {
                return mid;
            } else if (midNim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
