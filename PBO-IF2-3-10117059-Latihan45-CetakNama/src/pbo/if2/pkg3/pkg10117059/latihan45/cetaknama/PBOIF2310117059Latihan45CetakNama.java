/*
 * NAMA       : Nizar F Ryamizard
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan cetak nama
 */
package pbo.if2.pkg3.pkg10117059.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("Aplikasi pencetak Nama");
        System.out.println("Masukkan nama anda ");
        ptr.setNama(baca.nextLine());
        System.out.println("Mau cetak berapa kali : ");
        ptr.setJmlCetak(baca.nextInt()); //readln;
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
