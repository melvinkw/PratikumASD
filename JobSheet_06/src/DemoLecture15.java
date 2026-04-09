import java.util.Scanner;

public class DemoLecture15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LectureData15 data = new LectureData15();

        int choice;
        do {
            System.out.println("===== LECTURER DATA MENU =====");
            System.out.println("1. Add lecturer data");
            System.out.println("2. Show all lecturer data");
            System.out.println("3. Sort ASC by age (Bubble Sort)");
            System.out.println("4. Sort DSC by age (Selection Sort)");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Code: ");
                    String kode = sc.nextLine();

                    System.out.print("Name: ");
                    String nama = sc.nextLine();

                    System.out.print("Gender (true = Male, false = Female): ");
                    boolean jk = sc.nextBoolean();

                    System.out.print("Age: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    data.tambah(new Lecture15(kode, nama, jk, usia));
                    System.out.println("Lecturer data added.");
                    break;

                case 2:
                    System.out.println("===== ALL LECTURER DATA =====");
                    data.print();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data sorted ascending by age.");
                    data.print();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data sorted descending by age.");
                    data.print();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}