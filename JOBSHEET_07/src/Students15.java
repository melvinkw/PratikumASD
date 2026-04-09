public class Students15 {
    int nim, age;
    String name;
    double gpa;

    public Students15(int nim, String name, int age, double gpa){
        this.nim = nim;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void display(){
        System.out.println("NIM : " + nim);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("GPA : " + gpa);
    }
}