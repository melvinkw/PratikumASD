public class Perpustakaan15 {

    Buku15[] daftarBuku = new Buku15[100];
    Mahasiswa15[] daftarMahasiswa = new Mahasiswa15[100];

    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    void tambahBuku(Buku15 buku) {
        daftarBuku[jumlahBuku] = buku;
        jumlahBuku++;
        System.out.println("Buku ditambahkan");
        
    }

    void tambahMahasiswa(Mahasiswa15 mhs) {
        daftarMahasiswa[jumlahMahasiswa] = mhs;
        jumlahMahasiswa++;
        System.out.println("mahasiswa ditambahkan");
    }


    Buku15 cariBuku(String kodeBuku) {
        for (int i = 0; i<jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kodeBuku)) {
                return daftarBuku[i];
            }
        }
        return null;

    }

    Mahasiswa15 cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa;i++){
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    void tampilkanPeminjaman() {
        System.out.println("\nDaftar yang meminjam buku:");
        boolean ada = false;

        for(int i = 0 ;i < jumlahMahasiswa; i++) {
            Mahasiswa15 mhs = daftarMahasiswa [i];

            if (mhs.jumlahDipinjam > 0) {
                ada = true;
                System.out.println(mhs.nama + "meminjam: ");

                for(int j = 0;j < mhs.jumlahDipinjam;j++) {
                    System.out.println(mhs.bukuDipinjam[j].judulBuku);

                    if (j < mhs.jumlahDipinjam - 1) System.out.print(", ");
                }
                System.out.println();
            }
        }

        if (!ada) {
            System.out.println("Tidak ada yang sedang meminjam");
        }

        System.out.println();
    }
}