import java.util.Scanner;

public class StudentDemo15 {
    public static void main(String[] args) {
        Student15[] arrayofStudent = new Student15[3];
        Scanner sc = new Scanner(System.in);
        String dummy;

        for (int i=0; i<3; i++){
            arrayofStudent[i] = new Student15();
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM       :");
            arrayofStudent[i].nim = sc.nextLine();
            System.out.print("NAMA      :");
            arrayofStudent[i].nama = sc.nextLine();
            System.out.print("Kelas      :");
            arrayofStudent[i].kelas = sc.nextLine();
            System.out.print("IPK        :");
            dummy = sc.nextLine();
            arrayofStudent[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayofStudent[i].cetakInfo(); 
        }
        
        // arrayofStudent[0] = new Student15();
        // arrayofStudent[0].nim = "254107060076";
        // arrayofStudent[0].nama = "MELVIN KARYA WIRYAWAN";
        // arrayofStudent[0].kelas = "SIB 1G";
        // arrayofStudent[0].ipk = (float) 3.75;

        // arrayofStudent[1] = new Student15();
        // arrayofStudent[1].nim = "254107060106";
        // arrayofStudent[1].nama = "CALISTHA NATHANIA ARDIJAMONO";
        // arrayofStudent[1].kelas = "SIB 1G";
        // arrayofStudent[1].ipk = (float) 3.36;

        // arrayofStudent[2] = new Student15();
        // arrayofStudent[2].nim = "254107060086";
        // arrayofStudent[2].nama = "NABEEL";
        // arrayofStudent[2].kelas = "SIB 1G";
        // arrayofStudent[2].ipk = (float) 3.80;

        // System.out.println("NIM     : " + arrayofStudent[0].nim);
        // System.out.println("Nama    : " + arrayofStudent[0].nama);
        // System.out.println("Kelas   : " + arrayofStudent[0].kelas);
        // System.out.println("IPK     : " + arrayofStudent[0].ipk);
        // System.out.println("-----------------------------------------");
        // System.out.println("NIM     : " + arrayofStudent[1].nim);
        // System.out.println("Nama    : " + arrayofStudent[1].nama);
        // System.out.println("Kelas   : " + arrayofStudent[1].kelas);
        // System.out.println("IPK     : " + arrayofStudent[1].ipk);
        // System.out.println("-----------------------------------------");
        // System.out.println("NIM     : " + arrayofStudent[2].nim);
        // System.out.println("Nama    : " + arrayofStudent[2].nama);
        // System.out.println("Kelas   : " + arrayofStudent[2].kelas);
        // System.out.println("IPK     : " + arrayofStudent[2].ipk);
        // System.out.println("-----------------------------------------");
    }
}
