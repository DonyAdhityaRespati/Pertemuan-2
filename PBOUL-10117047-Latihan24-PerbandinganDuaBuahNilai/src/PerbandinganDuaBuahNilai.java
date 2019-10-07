
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
public class PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi variabel
        int n1;
        int n2;
        String lagi; //variabel pengontrol aktifitas
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
//        menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scn.nextInt();
            
//            rumus perbandingan
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
//            ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scn.next();
            
            System.out.println("");//memberi jarak satu baris
        } while (!lagi.equals("Tidak"));
    }
    
}
