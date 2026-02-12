import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double assignment, quiz, uts, uas, pAssignment = 20, pQuiz = 20, pUts = 30, pUas = 30, finalGrade;
        String letter, description;

        System.out.println("final score of students ");
        System.out.println("=========================");
        System.out.print("Input assignment scores (0-100): ");
        assignment = sc.nextDouble();
        System.out.print("Input quiz scores: ");
        quiz = sc.nextDouble();
        System.out.print("Input UTS scores: ");
        uts = sc.nextDouble();
        System.out.print("Input UAS scores: ");
        uas = sc.nextDouble();
        System.out.println("=========================");
        System.out.println("=========================");

        if (assignment < 0 || assignment > 100 || quiz < 0 || quiz > 100 || uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("Invalid value. Scores must be between 0 and 100.");
            return;
        }

        finalGrade = assignment * pAssignment/100.0 + quiz * pQuiz/100.0 + uts * pUts/100.0 + uas * pUas/100.0;
        if (finalGrade >= 81) {
            letter = "A";
        } else if (finalGrade >= 80) {
            letter = "B+";
        } else if (finalGrade >= 65) {
            letter = "B";
        } else if (finalGrade >= 60) {
            letter = "C+";
        } else if (finalGrade >= 50) {
            letter = "C";
        } else if (finalGrade >= 39) {
            letter = "D";
        } else {
            letter = "E";
        }

        if(letter.equals("D") || letter.equals("E")){
            System.out.printf("final grades: %.2f\n", finalGrade);
            System.out.println("letter grades: " + letter);
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Maaf Anda Tidak Lulus");
        } else{
             System.out.printf("final grades: %.2f\n", finalGrade);
            System.out.println("letter grades,: " + letter);
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Selamat Anda Lulus");
        }
    }

}
