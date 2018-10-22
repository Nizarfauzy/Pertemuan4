/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan41.massajenis;

/**
 *
 * @author kitttyyyy
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    //sisi int
    public int getSisi(){
        return sisi;
    }
    
    //void sisi
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    //massa int
    public int getMassa(){
        return massa;
    }
    
    //massa void
    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return sisi * sisi * sisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return massa / volume;
  }

    }