import java.util.Scanner;

public class StudentDemo15 {

    public static void main(String[] args) {

        TopStudent15 topStudent15 = new TopStudent15(5);
        topStudent15.add(new Student15("2201","Alice","A",3.9));
        topStudent15.add(new Student15("2202","Bob","B",3.7));
        topStudent15.add(new Student15("2204","Dacid","C",3.6));
        topStudent15.add(new Student15("2203","Charlie","D",3.8));
        topStudent15.add(new Student15("2205","Eve","E",4.0));

        // Scanner sc = new Scanner(System.in);
        // TopStudent15 topStudent15 = new TopStudent15(0);
        // String nim, nama, kelas;
        // Double ipk;

        // for (int i=0;i<5;i++){
        //     System.out.println("Input Student Data "+(i+1));
        //     System.out.print("NIM : ");
        //     nim = sc.nextLine(); 
        //     System.out.print("Nama : ");
        //     nama = sc.nextLine(); 
        //     System.out.print("Kelas : ");
        //     kelas = sc.nextLine(); 
        //     System.out.print("IPK : ");
        //     ipk = sc.nextDouble(); 

        //     Student15 s = new Student15(nim, nama, kelas, ipk);

        //     topStudent15.add(s);
        // }

        System.out.println("Original Student15 List");
        topStudent15.print();

        System.out.println("Sorted Student15 list (by GPA, descending)");
        topStudent15.bubbleSort();
        topStudent15.print();

        System.out.println("After Selection Sort (Ascending GPA) using Selection Sort");
        topStudent15.selectionSort();
        topStudent15.print();

        System.out.println("After Selection Sort (Ascending GPA) using Insertion Sort");
        topStudent15.insertionSort();
        topStudent15.print();
    }
}