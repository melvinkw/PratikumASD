public class Lecture15 {
    String code;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Lecture15(String kd, String name, boolean jk, int age) {
        this.code = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void print() {
        String gender = jenisKelamin ? "Male" : "Female";
        System.out.println("Code : " + code);
        System.out.println("Name : " + nama);
        System.out.println("Gender : " + gender);
        System.out.println("Age  : " + usia);
        System.out.println("--------------------------");
    }
}