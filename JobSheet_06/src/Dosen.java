public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        String gender = jenisKelamin ? "Male" : "Female";
        System.out.println("Code : " + kode);
        System.out.println("Name : " + nama);
        System.out.println("Gender : " + gender);
        System.out.println("Age  : " + usia);
        System.out.println("--------------------------");
    }
}