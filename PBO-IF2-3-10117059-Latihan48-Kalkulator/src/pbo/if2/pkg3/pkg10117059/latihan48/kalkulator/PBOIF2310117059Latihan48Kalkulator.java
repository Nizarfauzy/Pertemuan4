/*
 * NAMA       : Nizar F Rymizard
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan perhitungan
                       kalkulator
 */
package pbo.if2.pkg3.pkg10117059.latihan48.kalkulator;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator klt =  new Kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("VALUE 1 = "+klt.getValue1());
        System.out.println("VALUE 2 = "+klt.getValue2());
        klt.setNameProject();
        klt.setNoteProject(null);
        System.out.println("Result Add is = "+klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiplication is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    }
    