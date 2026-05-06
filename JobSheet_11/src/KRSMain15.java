import java.util.Scanner;

public class KRSMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue15 queue = new KRSQueue15(10); 
        int choice;

        do {
            System.out.println("\n=== DPA KRS Approval System ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Process KRS (Dequeue 2 students)");
            System.out.println("3. Show All Students in Queue");
            System.out.println("4. Show First Two Students in Line");
            System.out.println("5. Show Last Student in Queue");
            System.out.println("6. Show Queue & KRS Statistics");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    Student15 std = new Student15(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.processKRS();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peekTwo();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    queue.printStatistics();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid menu selection!!");
            }
        } while (choice != 0);

        sc.close();
    }
}