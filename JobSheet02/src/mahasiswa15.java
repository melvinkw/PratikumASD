

public class mahasiswa15 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public mahasiswa15(){

    }

    public mahasiswa15(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }


    void tampilkanInformasi(){
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("ipk: " + ipk);
        System.out.println("kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
        }   else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja Kurang";
        }
    }

    
}
