
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Dony Adhitya Respati
 * KELAS    : PBOUL
 * NIM      : 10117047
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi variabel
        String d; // variabel untuk validasi aja
        double diameter; //variabel yg untuk operand
        double r; //jari-jari
        double L; //luas
        double K; //keliling
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
//        menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            //validasi input yang masuk
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
//        konversi dari string ke double, untuk melakukan perhitungan aritmetika
        diameter = Double.parseDouble(d); 
        
//        rumus
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
    }
    
}
