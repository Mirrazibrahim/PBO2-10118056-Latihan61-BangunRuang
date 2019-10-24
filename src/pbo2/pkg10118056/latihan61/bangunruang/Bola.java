/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA : MIrraz Ibrahim
 * KELAS : IF-2
 * NIM : 10118056
 */
public class Bola extends BangunRuang{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungaVolume() {
        return 4*Math.PI*(r*r*r)/3;
    }   
    

    
}
