public class Student15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Student15() {

    }

    public Student15(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    void print() {
        System.out.println("NIM   : " + nim + ", Name   : " + nama  + ", Class   : " + kelas + ", GPA   : " + ipk);
    }
}