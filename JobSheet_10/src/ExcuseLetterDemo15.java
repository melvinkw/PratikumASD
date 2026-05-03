import java.util.Scanner;

public class ExcuseLetterDemo15 {
    public static void main(String[] args) {
        ExcuseLetterStack15 stack = new ExcuseLetterStack15(10);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.println("5. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type of Excuse (S for Sick / I for Other): ");
                    char type = scan.nextLine().charAt(0);
                    System.out.print("Duration (in days): ");
                    int duration = scan.nextInt();
                    
                    ExcuseLetter15 newLetter = new ExcuseLetter15(id, name, className, type, duration);
                    stack.push(newLetter);
                    System.out.println("Excuse letter submitted.");
                    break;
                case 2:
                    ExcuseLetter15 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter for " + processed.name + " (" + processed.typeOfExcuse + ")");
                    }
                    break;
                case 3:
                    ExcuseLetter15 topLetter = stack.peek();
                    if (topLetter != null) {
                        System.out.println("Latest letter is from " + topLetter.name);
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scan.nextLine();
                    stack.searchByName(searchName);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
        scan.close();
    }
}