import java.util.Scanner;

public class PowerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of elements: ");
        int elemen = sc.nextInt();

        Power[] pangkat = new Power[elemen];

        for(int i = 0; i < elemen; i++){
            System.out.print("Input base number for " + (i+1) + "th element: ");
            int base = sc.nextInt();

            System.out.print("Input exponent for " + (i+1) + "th element: ");
            int exp = sc.nextInt();

            pangkat[i] = new Power(base, exp);
        }

        for(int i = 0; i < elemen; i++){
            System.out.println("Result BF : " + pangkat[i].powerBF(pangkat[i].baseNumber, pangkat[i].exponent));
            System.out.println("Result DC : " + pangkat[i].powerDC(pangkat[i].baseNumber, pangkat[i].exponent));
        }
    }
}