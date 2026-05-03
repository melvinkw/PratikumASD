import java.util.Scanner;

public class StudentDemo15 {
    public static void main(String[] args) {
        StudentAssignmentStack15 stack = new StudentAssignmentStack15(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.println("5. View First Assignment"); //modify number 5
            System.out.println("6.Count assignments"); //modify number 6
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    Student15 std = new Student15 (nim, name, className);
                    stack.push(std);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", std.name);
                    break;
                case 2:
                    Student15 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                        
                        //pratikum 2
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;
                case 3:
                    Student15 view = stack.peek();
                    if (view != null) {
                        System.out.println("The last assignment comes from " + view.name);
                    }
                    break;
                case 4:
                    System.out.println("Assignment list:");
                    System.out.println("NIM\tName\tClass Name");
                    stack.print();
                    break;
                //modify number 5
                case 5:
                    Student15 first = stack.peekFirst();
                    if(first != null) {
                        System.out.println("The first assignment comes from "+first.name);
                    }
                    break;
                //modify number 6
                case 6:
                    System.out.println("Total assignment in stack "+stack.count());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 4);
        
        scan.close();
    }
}