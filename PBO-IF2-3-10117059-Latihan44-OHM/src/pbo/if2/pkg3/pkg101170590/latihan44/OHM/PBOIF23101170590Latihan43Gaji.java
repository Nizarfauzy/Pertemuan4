/*
 *  NAMA     : Nizar F Ryamizard
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       menghitung ohm
 */
package pbo.if2.pkg3.pkg101170590.latihan44.OHM;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF23101170590Latihan43Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai btr = new Baterai(3,12);
        System.out.println("Kuat Arus : " + btr.getKuatArus() + " Ampere");
        System.out.println("Hambatan Arus : " + btr.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + btr.hitungTegangan() + " volt");
    }
    
}
