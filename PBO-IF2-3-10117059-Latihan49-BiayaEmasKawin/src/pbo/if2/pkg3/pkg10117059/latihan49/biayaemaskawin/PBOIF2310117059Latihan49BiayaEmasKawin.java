/*
 * NAMA       : Nizar F Ryamizard
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menghitung  biaya
                       emas kawin
 */
package pbo.if2.pkg3.pkg10117059.latihan49.biayaemaskawin;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas(15.7);
        System.out.println("Hitung Mahar Nikah");  
        System.out.println("Harga Emas Saat ini Rp. "+emas.getHarga()+" per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : "+emas.getBerat()+" gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. "+emas.hitungHargaEmas(emas.getBerat(), emas.getHarga()));
    }
    
}
