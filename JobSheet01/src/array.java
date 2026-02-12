import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] courses = {
            "Pancasila",
            "Concept of Information Technology",
            "Critical Thinking and Problem Solving",
            "Basic Mathematics",
            "English",
            "Introduction to Programming",
            "Programming Practicum",
            "Occupational Safety and Health"
        };

        double[] scores = new double[courses.length];
        String[] letters = new String[courses.length];
        double[] points = new double[courses.length];

        System.out.println("===================================");
        System.out.println("Program: Calculate Semester GPA");
        System.out.println("===================================");

        for (int i = 0; i < courses.length; i++) {

            System.out.print("Enter numeric score for " + courses[i] + ": ");
            scores[i] = sc.nextDouble();
        }

        for (int i = 0; i < courses.length; i++) {

            double s = scores[i];

            if (s > 80 && s <= 100) {
                letters[i] = "A";
                points[i] = 4.00;
            }
            else if (s > 73) {
                letters[i] = "B+";
                points[i] = 3.50;
            }
            else if (s > 65) {
                letters[i] = "B";
                points[i] = 3.00;
            }
            else if (s > 60) {
                letters[i] = "C+";
                points[i] = 2.50;
            }
            else if (s > 50) {
                letters[i] = "C";
                points[i] = 2.00;
            }
            else if (s > 39) {
                letters[i] = "D";
                points[i] = 1.00;
            }
            else {
                letters[i] = "E";
                points[i] = 0.00;
            }
        }

        System.out.println("\n===================================");
        System.out.println("Conversion Results");
        System.out.println("===================================");
        System.out.printf("%-30s %10s %10s %10s%n","Course", "Score", "Letter", "Point");
        System.out.println("----------------------------------------------------");

        double totalPoint = 0;

        for (int i = 0; i < courses.length; i++) {

            System.out.printf("%-30s %10.2f %10s %10.2f%n",
                    courses[i], scores[i], letters[i], points[i]);

            totalPoint += points[i];
        }

        System.out.println("----------------------------------------------------");

        double gpa = totalPoint / courses.length;

        System.out.printf("GPA : %.2f%n", gpa);

        sc.close();
    }
}
