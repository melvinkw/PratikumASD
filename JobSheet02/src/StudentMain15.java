public class StudentMain15 {
    public static void main(String[] args) {
        mahasiswa15 mhs1 = new mahasiswa15();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa15 mhs2 = new mahasiswa15("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa15 mhs3 = new mahasiswa15("Melvin", "254107060076", 3.8, "SIB-1G");
        mhs3.tampilkanInformasi();
        System.out.println("Kinerja: " + mhs3.nilaiKinerja());
    }
}
