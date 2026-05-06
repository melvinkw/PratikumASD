import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();

        Student15 std1 = new Student15("001", "Student 1", "TI-1I", 3.89);
        Student15 std2 = new Student15("002", "Student 2", "TI-1I", 3.45);
        Student15 std3 = new Student15("003", "Student 3", "TI-1I", 3.20);
        Student15 std4 = new Student15("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        //Modify number 3
        // Scanner sc = new Scanner(System.in);
        // SingleLinkedList15 sll = new SingleLinkedList15();

        // System.out.println("Enter Student Data:");
        // System.out.print("NIM: ");
        // String nim = sc.nextLine();
        // System.out.print("Name: ");
        // String name = sc.nextLine();
        // System.out.print("Class: ");
        // String className = sc.nextLine();
        // System.out.print("GPA: ");
        // double gpa = sc.nextDouble();

        // Student15 stdInput = new Student15(nim, name, className, gpa);
        // sll.addFirst(stdInput); // Adds the inputted student to the linked list
        // sll.print();
        
        // sc.close();
        
        //Experiment 2
        System.out.println("Data at index 1 is:");
        Student15 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}