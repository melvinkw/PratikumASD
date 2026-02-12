import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Hitung Nilai Akhir ====");
        System.out.print("Nilai Tugas (0-100): ");
        double tugas = sc.nextDouble();
        System.out.print("Nilai Kuis (0-100): ");
        double kuis = sc.nextDouble();
        System.out.print("Nilai UTS (0-100): ");
        double uts = sc.nextDouble();
        System.out.print("Nilai UAS (0-100): ");
        double uas = sc.nextDouble();

        // Cek validitas input
        if (!valid(tugas) || !valid(kuis) || !valid(uts) || !valid(uas)) {
            System.out.println("nilai tidak valid");
            return; 
        }

        double wTugas = 20, wKuis = 20, wUTS = 30, wUAS = 30;

        double nilaiAkhir = tugas * wTugas/100.0 + kuis * wKuis/100.0 + uts * wUTS/100.0 + uas * wUAS/100.0;
        String huruf = toHuruf(nilaiAkhir);
        String keterangan = (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B") || huruf.equals("C+") || huruf.equals("C")) ? "LULUS" : "TIDAK LULUS";

        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + huruf);
        System.out.println("Keterangan: " + keterangan);
    }

    static boolean valid(double x) {
        return x >= 0 && x <= 100;
    }

    static String toHuruf(double n) {
        if (n >= 85) return "A";
        if (n >= 80) return "B+";
        if (n >= 75) return "B";
        if (n >= 70) return "C+";
        if (n >= 65) return "C";
        if (n >= 50) return "D";
        return "E";
    }
}
