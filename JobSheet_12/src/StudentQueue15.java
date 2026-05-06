public class StudentQueue15 {
    String nim, name, purpose;

    public StudentQueue15(String nim, String name, String purpose) {
        this.nim = nim;
        this.name = name;
        this.purpose = purpose;
    }

    void print() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Purpose: " + purpose);
    }
}