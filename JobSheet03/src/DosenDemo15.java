import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen15[] listDosen = new Dosen15[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nLecturer " + (i + 1));

            System.out.print("Code   : ");
            String code = sc.nextLine();

            System.out.print("Name   : ");
            String name = sc.nextLine();

            System.out.print("Gender (true=Male / false=Female): ");
            Boolean gender = sc.nextBoolean();
            sc.nextLine();

            System.out.print("Age    : ");
            int age = sc.nextInt();
            sc.nextLine();

            listDosen[i] = new Dosen15(code, name, gender, age);
        }

        System.out.println("\n=== Lecturer Data ===");

        for (Dosen15 d : listDosen) {
            d.printInfo();
        }

        DataDosen15.dataAllDosen(listDosen);
        DataDosen15.numberOfLecturersPerGender(listDosen);
        DataDosen15.AverageumurOfLecturersPerGender(listDosen);
        DataDosen15.infoDosenPalingTua(listDosen);
        DataDosen15.infoDosenMostYoungest(listDosen);

        sc.close();
    }
}
