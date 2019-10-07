/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author 
 * NAMA     : Dony Adhitya Respati
 * KELAS    : PBOUL
 * NIM      : 10117047
 * Deskripsi Program : Menampilkan bilangan kelipatan 3,5 dari 3,5 sampai dengan
 * 35 menggunakan looping for dengan typedata pengontrol menggunakan double
 * 
 */
public class Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi variabel
        double bilangan;
        bilangan = 3.5;

        System.out.println("Tampilkan bilangan kelipatan 3,5 dumulai dari"
                + " 3,5 sampai dengan 35\n");
//        proses looping 
        for (double i = 3.5; i <= 35; i+=3.5) {
            System.out.println(i);
    }
    
}
}
