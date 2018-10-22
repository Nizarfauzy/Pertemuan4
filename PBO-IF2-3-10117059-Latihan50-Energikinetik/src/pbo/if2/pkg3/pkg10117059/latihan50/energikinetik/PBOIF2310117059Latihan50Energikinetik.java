/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan50.energikinetik;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan50Energikinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Energi bola = new Energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan masa = " + bola.getMassa() + " g");
        System.out.println("Bola baseball tersebut dilempar dengan kecepatan = " + bola.getKecepatan() + " m/s");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + bola.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    }
    
