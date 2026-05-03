public class Student15 {
    String nim;
    String name;
    String study_program;

    public Student15(String nim, String name, String study_program) {
        this.nim = nim;
        this.name = name;
        this.study_program = study_program;
    }

    void printStudent() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + study_program);
    }
}