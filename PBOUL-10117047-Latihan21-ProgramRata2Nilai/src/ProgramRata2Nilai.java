
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
public class ProgramRata2Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi variabel
        int nMhs;
        int nilaiMhs;
        double totalNilai;
        double rataNilai;
        //deklarasi untuk inputan scanner
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
        totalNilai = 0; //inisialisasi total mahasiswa 0
//        looping sesuai dengan jumlah mahasiswa yang telah diinputkan
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs = scn.nextInt();
            totalNilai += nilaiMhs; //menampung totall nilai mahasiswa
        }
        
//        rumus menghitung rata-rata nilai mahasiswa
        rataNilai = totalNilai/nMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataNilai);
        System.out.println("Developed by: Dony Adhitya Respati");
    }
    
}
