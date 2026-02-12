import java.util.Scanner;

public class assignment02 {

    public static void inputSchedule(String[][] schedule, int n, Scanner sc) {

        for (int i = 0; i < n; i++) {

            System.out.println("\nSchedule " + (i + 1));

            System.out.print("Course Name   : ");
            schedule[i][0] = sc.nextLine();

            System.out.print("Room          : ");
            schedule[i][1] = sc.nextLine();

            System.out.print("Day           : ");
            schedule[i][2] = sc.nextLine();

            System.out.print("Time          : ");
            schedule[i][3] = sc.nextLine();
        }
    }

    public static void displayAll(String[][] schedule, int n) {

        System.out.println("\n================ LECTURE SCHEDULE ================");
        System.out.printf("%-25s %-15s %-12s %-15s%n",
                "Course", "Room", "Day", "Time");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-25s %-15s %-12s %-15s%n",
                    schedule[i][0],
                    schedule[i][1],
                    schedule[i][2],
                    schedule[i][3]);
        }
    }

    public static void displayByDay(String[][] schedule, int n, String day) {

        System.out.println("\nSchedule on " + day);

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (schedule[i][2].equalsIgnoreCase(day)) {

                System.out.printf("%-25s %-15s %-15s%n",
                        schedule[i][0],
                        schedule[i][1],
                        schedule[i][3]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No schedule found.");
        }
    }

    public static void displayByCourse(String[][] schedule, int n, String course) {

        System.out.println("\nSchedule for course: " + course);

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (schedule[i][0].equalsIgnoreCase(course)) {

                System.out.println("Room : " + schedule[i][1]);
                System.out.println("Day  : " + schedule[i][2]);
                System.out.println("Time : " + schedule[i][3]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of schedules: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] schedule = new String[n][4];

        inputSchedule(schedule, n, sc);

        displayAll(schedule, n);

        System.out.print("\nEnter day to search: ");
        String day = sc.nextLine();
        displayByDay(schedule, n, day);

        System.out.print("\nEnter course name to search: ");
        String course = sc.nextLine();
        displayByCourse(schedule, n, course);

        sc.close();
    }
}
