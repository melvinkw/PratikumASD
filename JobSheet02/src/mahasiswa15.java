public class mahasiswa15 {

    String nama;
    String nim;
    String kelas;
    double ipk;

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
        ipk = ipkBaru;
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
    public static void main(String[] args) {
        
    }
}
