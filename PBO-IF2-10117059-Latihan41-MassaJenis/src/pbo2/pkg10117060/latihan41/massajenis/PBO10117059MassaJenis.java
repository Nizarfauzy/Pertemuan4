/*
 * NAMA       : Irfan Faisal Hutama Tanjung
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini untuk MENAMPILKAN MASSA JENIS KUBUS
 */
package pbo2.pkg10117060.latihan41.massajenis;
/**
 *
 * @author kitttyyyy
 */
public class PBO10117059MassaJenis {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kbs = new Kubus();
        kbs.setSisi(5);
        kbs.setMassa(250);
            System.out.println("====Massa Jenis Kubus=====");
            System.out.println("sisi " + kbs.getSisi());
            System.out.println("massa " + kbs.getMassa());
            System.out.println("");
            
            System.out.println("====Hasil Perhitungan======");
            System.out.println("volume : " + kbs.hitungVolume(5));
            System.out.println("Massa Jenis " + kbs.hitungMassaJenis(240, + kbs.hitungVolume(5)));
            
 }
}