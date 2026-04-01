import java.util.Scanner;

public class MainFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = sc.nextInt();

        Factorial f = new Factorial();

        System.out.println("Factorial Brute Force : " + f.factorialBF(num));
        System.out.println("Factorial Divide Conquer : " + f.factorialDC(num));
    }
}