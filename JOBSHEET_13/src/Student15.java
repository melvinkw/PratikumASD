public class Student15 {
    String nim, name, className;
    double gpa;

    public Student15() {
    }

    public Student15(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " " + name + " " + className + " " + gpa);
    }
}