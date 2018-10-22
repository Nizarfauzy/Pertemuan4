/*
 * NAMA       : Nizar F Ryamizard
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       gaji pegawai
 */
package pbo.if2.pkg3.pkg10117059.latihan43.gajipegawai;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("### Data gaji karyawan ###");
        System.out.println("--------------------------");
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jalan semar dlm 4 no 72/66");
        pegawai.setUangTransport(25000);
        pegawai.setUangTunjangan(30000);
        pegawai.setGajiPokok(45000);
        pegawai.setTotalGaji(pegawai.getTotalGaji());
        pegawai.tampilData(pegawai.getNama(), pegawai.getAlamat(), pegawai.getUangTunjangan(),
                pegawai.getUangTransport(), pegawai.getGajiPokok(), pegawai.getTotalGaji());
    }
    
}
