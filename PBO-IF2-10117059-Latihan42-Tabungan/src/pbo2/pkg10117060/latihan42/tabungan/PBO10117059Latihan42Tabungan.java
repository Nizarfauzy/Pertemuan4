/*
 *NAMA       : Nizar F Ryamizard
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       tabungan
 */
package pbo2.pkg10117060.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author kitttyyyy
 */
public class PBO10117059Latihan42Tabungan {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        
        System.out.print("Jumlah yang mau diambil ");
        tabungan.ambilUang(scn.nextInt());
        
        System.out.println("Saldo anda sekarang : " + tabungan.ambilUang(0));
         
 }
}