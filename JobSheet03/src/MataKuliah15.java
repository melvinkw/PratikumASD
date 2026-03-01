public class MataKuliah15 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah15() {
    // Ini konstruktor 1 (Default / tanpa parameter)
    }

    public MataKuliah15(String kode, String nama, int sks, int jumlahJam) {
    // Ini konstruktor 2 (Parameterized)
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void addData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void printInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Sks        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println("------------------------------------");
    }
}
