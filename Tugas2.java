/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dini aryani
 */
import java.util.Scanner;
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int scorekoding = 60;
        String nilaiKoding = "";
        String nilaiInterview = "";
        System.out.print("Masukkan score koding : ");
        scorekoding = in.nextInt();
        
        
        if ( scorekoding > 80 ) {
      nilaiKoding = "LOLOS";
      nilaiInterview = "A";
        }
        else if ( scorekoding > 60 & scorekoding < 80 ) {
      nilaiKoding = "DIPERTIMBANGKAN";
      nilaiInterview = "B";
    }

    else if ( scorekoding < 60 ) {
      nilaiInterview = "GAGAL";
    }


    if (
            "LOLOS".equals(nilaiKoding) || "DIPERTIMBANGKAN".equals(nilaiKoding) &&
     (  "A".equals(nilaiInterview) || nilaiInterview == "B")
    ) {
        System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    } else {
        System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }
    }
    
}
