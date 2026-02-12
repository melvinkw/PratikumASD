import java.util.Scanner;

public class assignment01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] code = {'A', 'B', 'D', 'E', 'F','G', 'H', 'L', 'N', 'T'};

        char[][] city = {{'B','A','N','T','E','N'},{'J','A','K','A','R','T','A'},{'B','A','N','D','U','N','G'},{'C','I','R','E','B','O','N'},{'B','O','G','O','R'},{'P','E','K','A','L','O','N','G','A','N'},{'S','E','M','A','R','A','N','G'},{'S','U','R','A','B','A','Y','A'},{'M','A','L','A','N','G'},{'T','E','G','A','L'}
        };

        System.out.print("Input License Plate: ");
        String plate = sc.nextLine().toUpperCase();

        char firstCode = plate.charAt(0);

        int index = -1;

        for (int i = 0; i < code.length; i++) {

            if (code[i] == firstCode) {
                index = i;
                break;
            }
        }

        if (index != -1) {

            System.out.print("City: ");

            for (int i = 0; i < city[index].length; i++) {
                System.out.print(city[index][i]);
            }

            System.out.println();

            String newPlate = plate.substring(1).trim();

            System.out.println("Plate without city code: " + newPlate);

        } else {
            System.out.println("City code not found!");
        }

        sc.close();
    }
}
