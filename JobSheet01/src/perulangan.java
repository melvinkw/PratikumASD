import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nim;
        int n;

        System.out.print("Input Ur NIM: ");
        nim  = sc.nextLine();

        System.out.print("Input Ur N: ");
        n  = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("#");
            }
            else if (i % 2 == 1) {
                System.out.print("*");
            }
            else {
                System.out.print(i);
            }

            if (i < n) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
