import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Student15[] students = {
            new Student15("22001", "Andi", "Teknik Informatika"),
            new Student15("22002", "Budi", "Teknik Informatika"),
            new Student15("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Book15[] books = {
            new Book15("B001", "Algoritma", 2020),
            new Book15("B002", "Basis Data", 2019),
            new Book15("B003", "Pemrograman", 2021),
            new Book15("B004", "Fisika", 2024)
        };

        bookLending15[] loans = {
            new bookLending15(students[0], books[0], 7),
            new bookLending15(students[1], books[1], 3),
            new bookLending15(students[2], books[2], 10),
            new bookLending15(students[2], books[3], 6),
            new bookLending15(students[0], books[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Search by Student ID");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch(menu) {
                case 1:
                    System.out.println("Student List:");
                    for (Student15 s : students) {
                        s.printStudent();
                    }
                    break;
                case 2:
                    System.out.println("Book List:");
                    for (Book15 b : books) {
                        b.printBook();
                    }
                    break;
                case 3:
                    System.out.println("Loan Data:");
                    for (bookLending15 l : loans) {
                        l.printLending();
                    }
                    break;
                case 4:
                    System.out.println("After sorting (Largest fine):");
                    insertionSortByFine(loans);
                    for (bookLending15 l : loans) {
                        l.printLending();
                    }
                    break;
                case 5:
                    System.out.print("Enter NIM: ");
                    String searchNim = sc.nextLine();
                    insertionSortByNim(loans); 
                    binarySearchByNim(loans, searchNim);
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        } while (menu != 0);
        
        sc.close();
    }

    public static void insertionSortByFine(bookLending15[] arr) {
        int latecount = 0;

        for (int i = 0; i < arr.length;i++){
            if (arr[i].loanPeriod > 5){
                latecount++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            bookLending15 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].fine < key.fine) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Number of students whose load periode exceed 5 days = "+latecount);
    }

    public static void insertionSortByNim(bookLending15[] arr) {
        for (int i = 1; i < arr.length; i++) {
            bookLending15 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].sdt.nim.compareTo(key.sdt.nim) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void binarySearchByNim(bookLending15[] arr, String nim) {
        int left = 0;
        int right = arr.length - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = arr[mid].sdt.nim.compareTo(nim);

            if (cmp == 0) {
                foundIndex = mid;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (foundIndex != -1) {
            int start = foundIndex;
            int end = foundIndex;

            while (start > 0 && arr[start - 1].sdt.nim.equals(nim)) {
                start--;
            }
            while (end < arr.length - 1 && arr[end + 1].sdt.nim.equals(nim)) {
                end++;
            }

            for (int i = start; i <= end; i++) {
                arr[i].printLending();
            }
        } else {
            System.out.println("Data not found.");
        }
    }
}