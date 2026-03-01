public class Dosen15 {
    public String kode;
    public String nama;
    public boolean gender;
    public int umur;

    public Dosen15() {
    }

    public Dosen15(String kode, String nama, boolean gender, int umur) {
        this.kode = kode;
        this.nama = nama;
        this.gender = gender;
        this.umur = umur;
    }


    public void printInfo() {
        System.out.println("Kode  : " + this.kode);
        System.out.println("Nama  : " + this.nama);
        System.out.println("Gender: " + (this.gender ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur  : " + this.umur);
        System.out.println("------------------------------------");
    }
}
