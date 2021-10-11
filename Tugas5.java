/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dini aryani
 */
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 19;
    int tinggi = 166;
    int tarif = 50000;

    if ( umur < 1 ) {
      System.out.println("Dilarang masuk");
    }


    if ( umur <= 3 & umur > 0 ) {
      tarif = 30000;

      if (tinggi >= 70) {
        tarif += 10000;
      }
    }

    if ( umur <= 7 & umur >= 4 ) {
      tarif = 40000;

      if (tinggi >= 120) {
        tarif += 15000;
      }
    }


    if ( umur <= 10 & umur >= 8 ) {
      tarif = 40000;

      if (tinggi >= 150) {
        tarif += 20000;
      }
    }

    if ( umur >= 10 ) {
      tarif = 80000;
    }

    System.out.println("Harga Masuk : " + tarif);
    
    }
    
}
