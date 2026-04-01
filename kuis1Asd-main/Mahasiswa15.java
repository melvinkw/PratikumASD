public class Mahasiswa15 {

    String nim;
    String nama;

    Buku15[] bukuDipinjam = new Buku15[2];

    int jumlahDipinjam = 0;

    Mahasiswa15(String nim, String nama ){
        this.nim = nim;
        this.nama = nama;

    }

    // method utk pinjam buku
    void pinjam(Buku15 buku) {
        if (jumlahDipinjam >= 2) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena " + nama + " sudah meminjam 2 buku.");
            return;
        }

        if (buku.statusPeminjaman) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena sudah dipinjam orang lain");
            return;
        }

        bukuDipinjam[jumlahDipinjam] = buku;
        jumlahDipinjam++;
        buku.statusPeminjaman = true;

        System.out.println(nama + " berhasi meminjam " + buku.judulBuku);

    }

    // method untuk kembalikan buku
    void kembalikan(Buku15 buku) {
        boolean ketemu = false;

        for (int i = 0;i < jumlahDipinjam;i++){
            if (bukuDipinjam[i].kodeBuku.equalsIgnoreCase(buku.kodeBuku)) {
                
                for (int j = i; j < jumlahDipinjam - 1;j++){
                    bukuDipinjam[j] = bukuDipinjam[j + 1];
                }

                bukuDipinjam[jumlahDipinjam - 1] = null;
                jumlahDipinjam--;
                buku.statusPeminjaman = false;
                ketemu = true;
                System.out.println(nama + " berhasil mengembalikan " + buku.judulBuku);
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Gagal: "+ nama + "tidak pinjam buku tersebut");
        }
    }
}