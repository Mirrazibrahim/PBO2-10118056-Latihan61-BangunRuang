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
public class Terster {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Jari-Jari dari sebuah bola basket adalah 7cm.");
        System.out.println("Hasil: V = " + bola.hitungaVolume() + " cm3");
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Sebuah tabung memiliki jari-jari berukuran 10cm. Jika tingginya 21cm.");
        System.out.println("Hasil: V = " + tabung.hitungaVolume() + " cm3");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setT(9);
        kerucut.setR(14);
        
        System.out.println("Diketahui tinggi sebuah kerucut 9cm. Jika jari-jarinya 14cm.");
        System.out.println("Hasil: V = " + kerucut.hitungaVolume() + " cm3");
        
    }
        
}
