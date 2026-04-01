import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Perpustakaan15 p = new Perpustakaan15();
        int pilihan = 0 ;

        while (pilihan !=6) {
            
            System.out.println("Menu Perpustakaan:");
            System.out.println("1. Tambah buku");
            System.out.println("2. Tambah mahasiswa");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Kembalikan buku");
            System.out.println("5. Tampilkan peminjam");
            System.out.println("6. keluar");
            System.out.print("Pilih menu:");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (pilihan == 1) {
                System.out.println("Masukkan kode buku: ");
                String kode = sc.nextLine();
                System.out.println("Masukkan judul buku: ");
                String judul = sc.nextLine();
                System.out.println("Masukkan penulis: ");
                String penulis = sc.nextLine();
                p.tambahBuku(new Buku15(kode, judul, penulis));

            } else if (pilihan == 2) {
                System.out.println("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                System.out.println("Masukkan nama mahasiswa: ");
                String nama = sc.nextLine();
                p.tambahMahasiswa(new Mahasiswa15(nim, nama));

            } else if (pilihan == 3) {
                
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                System.out.print("Masukkan kode buku: ");
                String kode = sc.nextLine();

                Mahasiswa15 mhs = p.cariMahasiswa(nim);
                Buku15 buku = p.cariBuku(kode);

                if (mhs == null) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                } else if (buku == null) {
                    System.out.println("Buku dengan kode " + kode + " tidak ditemukan.");
                } else {
                    mhs.pinjam(buku);
                }

            } else if (pilihan == 4) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                System.out.print("Masukkan kode buku: ");
                String kode = sc.nextLine();

                Mahasiswa15 mhs = p.cariMahasiswa(nim);
                Buku15 buku = p.cariBuku(kode);

                if (mhs == null) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                } else if (buku == null) {
                    System.out.println("Buku dengan kode " + kode + " tidak ditemukan.");
                } else {
                    mhs.kembalikan(buku);
                }

            } else if (pilihan == 5) {
                p.tampilkanPeminjaman();

            } else if (pilihan == 6) {
                System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");

            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }

            System.out.println();
        }

        sc.close();
    }
}

    