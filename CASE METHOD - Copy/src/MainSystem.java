import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        // Student15[] students = {
        //     new Student15("22001", "Andi", "Teknik Informatika"),
        //     new Student15("22002", "Budi", "Teknik Informatika"),
        //     new Student15("22003", "Citra", "Sistem Informasi Bisnis")
        // };

        // Book15[] books = {
        //     new Book15("B001", "Algoritma", 2020),
        //     new Book15("B002", "Basis Data", 2019),
        //     new Book15("B003", "Pemrograman", 2021),
        //     new Book15("B004", "Fisika", 2024)
        // };

        // bookLending15[] loans = {
        //     new bookLending15(students[0], books[0], 7),
        //     new bookLending15(students[1], books[1], 3),
        //     new bookLending15(students[2], books[2], 10),
        //     new bookLending15(students[2], books[3], 6),
        //     new bookLending15(students[0], books[1], 4)
        // };

        Scanner sc = new Scanner(System.in);

        Student15[] students = new Student15[100];
        Book15[] books = new Book15[100];
        bookLending15[] loans = new bookLending15[100];

        int studentCount = 0, bookCount=0, loanCount=0;
        int menu;

        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Search by Student ID");
            System.out.println("6. Input Students");
            System.out.println("7. Input Book");
            System.out.println("8. calculateTotalFineDC");
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
                case 6:
                    System.out.println("\n--- TAMBAH MAHASISWA ---");
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    
                    students[studentCount] = new Student15(nim, nama, prodi);
                    studentCount++;
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;
                case 7:
                    System.out.println("\n--- TAMBAH BUKU ---");
                    System.out.print("Kode Buku: "); String kode = sc.nextLine();
                    System.out.print("Judul: "); String judul = sc.nextLine();
                    System.out.print("Tahun: "); int tahun = sc.nextInt();
                    
                    books[bookCount] = new Book15(kode, judul, tahun);
                    bookCount++;
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case 8:
                    int totalSemuaDenda = calculateTotalFineDC(loans, 0, loans.length - 1);
                    System.out.println("Total denda seluruh mahasiswa: Rp. " + totalSemuaDenda);    
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
        for (int i = 1; i < arr.length; i++) {
            bookLending15 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].fine < key.fine) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSortByFine(bookLending15[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i; // Asumsikan indeks saat ini punya denda terbesar
            
            // Looping untuk mencari denda yang LEBIH BESAR di sisa array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].fine > arr[maxIndex].fine) { 
                    maxIndex = j; // Update indeks jika ketemu yang lebih besar
                }
            }
            
            // Swap (Tukar) nilai terbesar yang ditemukan dengan posisi i
            bookLending15 temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSortByFine(bookLending15[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Looping untuk membandingkan data bersebelahan
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Jika data sebelah kiri LEBIH KECIL dari data sebelah kanan, maka tukar
                if (arr[j].fine < arr[j + 1].fine) {
                    // Swap (Tukar) posisi
                    bookLending15 temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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

    public static void sequentialSearchByNim(bookLending15[] arr, String nim) {
        boolean isFound = false; // Penanda apakah data ketemu atau tidak

        // Looping mengecek data dari indeks 0 sampai akhir (Brute Force)
        for (int i = 0; i < arr.length; i++) {
            // Cukup gunakan .equals() untuk mengecek kecocokan String
            if (arr[i].sdt.nim.equals(nim)) {
                arr[i].printLending(); // Langsung cetak jika ketemu
                isFound = true;        // Ubah penanda jadi true
            }
        }

        // Jika setelah semua array dicek isFound tetap false
        if (!isFound) {
            System.out.println("Data not found.");
        }
    }

    // Tambahkan method ini di class MainSystem
    // Parameter 'left' adalah indeks awal (0), 'right' adalah indeks akhir (arr.length - 1)
    public static int calculateTotalFineDC(bookLending15[] arr, int left, int right) {
        // Base case: jika array sudah tidak bisa dibagi lagi (hanya 1 elemen)
        if (left == right) {
            return arr[left].fine;
        }
        
        // Divide: Cari titik tengah
        int mid = (left + right) / 2;
        
        // Conquer: Hitung total denda bagian kiri dan bagian kanan secara rekursif
        int leftSum = calculateTotalFineDC(arr, left, mid);
        int rightSum = calculateTotalFineDC(arr, mid + 1, right);
        
        // Combine: Gabungkan hasilnya
        return leftSum + rightSum;
    }
}