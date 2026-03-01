import java.util.Scanner;

public class MataKuliahDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Jawaban No 4: Panjang array ditentukan user
        System.out.print("Masukkan jumlah matakuliah yang ingin diinput: ");
        int jumlahArray = sc.nextInt();
        sc.nextLine(); 

        MataKuliah15[] arrayOfMataKuliah15 = new MataKuliah15[jumlahArray];
        String kode, nama, dummy;
        int sks, jumlahJam;
        
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");
            
            arrayOfMataKuliah15[i] = new MataKuliah15();
            
            // Jawaban No 2: Menggunakan method addData() untuk memasukkan data
            arrayOfMataKuliah15[i].addData(kode, nama, sks, jumlahJam);
        }
        
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            // Jawaban No 3: Menggunakan method printInfo()
            arrayOfMataKuliah15[i].printInfo();
        }
    }
}
