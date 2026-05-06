import java.util.Scanner;

public class QueueMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListQueue15 queue = new LinkedListQueue15();
        int menu;

        do {
            System.out.println("\n=== Student Service Queue ===");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. Show Front and Rear Students");
            System.out.println("4. Check Total Students in Queue");
            System.out.println("5. Check if Queue is Empty");
            System.out.println("6. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Purpose: ");
                    String purpose = sc.nextLine();
                    StudentQueue15 newStd = new StudentQueue15(nim, name, purpose);
                    queue.enqueue(newStd);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFrontRear();
                    break;
                case 4:
                    queue.printTotalStudents();
                    break;
                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is currently empty.");
                    } else {
                        System.out.println("The queue is NOT empty.");
                    }
                    break;
                case 6:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid menu option!");
            }
        } while (menu != 0);

        sc.close();
    }
}