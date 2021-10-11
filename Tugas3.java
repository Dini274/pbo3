/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dini aaryani
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nomorPunggung = 30;
    String posisi = "";
    
    if (nomorPunggung % 2 == 0) {
      posisi += "Target Attacker";

      if (nomorPunggung >= 50 && nomorPunggung <= 100) {
        posisi += " - Calon Capten team";
      }
      // bilangan ganjil
    if (nomorPunggung % 2 == 1) {
      posisi += "Defender";

      if (nomorPunggung > 90) {
        posisi += " - Playmaker";
      }
    }
    if (nomorPunggung % 3 == 0 || nomorPunggung % 5 == 0) {
      posisi += " - Keeper";
    }
      System.out.println(posisi);
    }
    
  }
}
