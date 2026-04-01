import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = sc.nextInt();

        StudentScore data = new StudentScore(n);

        for(int i = 0; i < n; i++){
            sc.nextLine();
            
            System.out.print("Input student name " + (i+1) + ": ");
            String name = sc.nextLine();

            System.out.print("Input year student " + (i+1) + ": ");
            int year = sc.nextInt();

            System.out.print("Input UTS score student " + (i+1) + ": ");
            data.uts[i] = sc.nextInt();

            System.out.print("Input UAS score student " + (i+1) + ": ");
            data.uas[i] = sc.nextInt();
        }

        System.out.println("Highest UTS score: " + data.highestUTS(0, n-1));
        System.out.println("Lowest UTS score: " + data.lowestUTS(0, n-1));
        System.out.println("Average UAS score: " + data.averageUAS());
    }
}