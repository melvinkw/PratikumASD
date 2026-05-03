import java.util.Scanner;

class Student {
    String nim, name, prodi;

    Student(String nim, String name, String prodi) {
        this.nim = nim;
        this.name = name;
        this.prodi = prodi;
    }
}

class Book {
    String code, title;
    int year;

    Book(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
    }
}

class Loan {
    Student student;
    Book book;
    int days;
    int fine;

    Loan(Student student, Book book, int days) {
        this.student = student;
        this.book = book;
        this.days = days;
        this.fine = calculateFine();
    }

    int calculateFine() {
        if (days > 5) {
            return (days - 5) * 2000;
        }
        return 0;
    }

    void display() {
        System.out.println(student.nim + " | " + student.name + " | " + book.title +
                " | " + days + " hari | Denda: " + fine);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DATA
        Student[] students = {
                new Student("22001", "Andi", "Informatics Engineering"),
                new Student("22002", "Budi", "Informatics Engineering"),
                new Student("22003", "Image", "Business Information Systems")
        };

        Book[] books = {
                new Book("B001", "Algorithm", 2020),
                new Book("B002", "Database", 2019),
                new Book("B003", "Programming", 2021),
                new Book("B004", "Physics", 2024)
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
            System.out.println("\n=== MENU ===");
            System.out.println("1. Display Students & Books");
            System.out.println("2. Display Loans");
            System.out.println("3. Calculate Fines");
            System.out.println("4. Sort by Highest Fine");
            System.out.println("5. Search by NIM");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nStudents:");
                    for (Student s : students) {
                        System.out.println(s.nim + " | " + s.name + " | " + s.prodi);
                    }

                    System.out.println("\nBooks:");
                    for (Book b : books) {
                        System.out.println(b.code + " | " + b.title + " | " + b.year);
                    }
                    break;

                case 2:
                    System.out.println("\nLoan Data:");
                    for (Loan l : loans) {
                        l.display();
                    }
                    break;

                case 3:
                    System.out.println("\nFines:");
                    for (Loan l : loans) {
                        System.out.println(l.student.name + " - Denda: " + l.fine);
                    }
                    break;

                case 4:
                    // Insertion Sort (descending fine)
                    for (int i = 1; i < loans.length; i++) {
                        Loan temp = loans[i];
                        int j = i - 1;

                        while (j >= 0 && loans[j].fine < temp.fine) {
                            loans[j + 1] = loans[j];
                            j--;
                        }
                        loans[j + 1] = temp;
                    }

                    System.out.println("\nSorted by Fine:");
                    for (Loan l : loans) {
                        l.display();
                    }
                    break;

                case 5:
                    System.out.print("Enter NIM: ");
                    String nim = sc.next();

                    // Binary Search (HARUS SORT dulu berdasarkan NIM)
                    // simple sort by nim
                    for (int i = 0; i < loans.length - 1; i++) {
                        for (int j = i + 1; j < loans.length; j++) {
                            if (loans[i].student.nim.compareTo(loans[j].student.nim) > 0) {
                                Loan temp = loans[i];
                                loans[i] = loans[j];
                                loans[j] = temp;
                            }
                        }
                    }

                    int left = 0, right = loans.length - 1;
                    boolean found = false;

                    while (left <= right) {
                        int mid = (left + right) / 2;

                        if (loans[mid].student.nim.equals(nim)) {
                            loans[mid].display();
                            found = true;
                            break;
                        } else if (loans[mid].student.nim.compareTo(nim) < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (!found) {
                        System.out.println("Data not found.");
                    }
                    break;
            }

        } while (choice != 0);
    }
}