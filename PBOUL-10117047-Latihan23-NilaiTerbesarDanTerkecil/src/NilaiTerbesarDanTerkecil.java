
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
public class NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi variabel
        String petugas;
        int nMhs; //jumlah mahasiswa
        int nBesar;
        int nKecil;
        int nilaiMhs[] = new int[40];
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
//        inisialisasi variabel
        nBesar = 0;
        nKecil = 100;
//        looping sesuai jumlahh mahasiswa
        for (int i = 0; i < nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilaiMhs[i] = scn.nextInt();
            
            //menentukan nilai terbesar dan nilai terkecil
            nBesar = ((nBesar<=nilaiMhs[i])?nilaiMhs[i]:nBesar);
            nKecil = ((nKecil>=nilaiMhs[i])?nilaiMhs[i]:nKecil);
        }
        
//       menampilkan nilai mahasiswa 
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < nMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" = "+nilaiMhs[i]+"\n");
        }
        
//        menampilkan hasil dari nilai terbesar dan nilai terkecil
        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        
//        nama petugas
        System.out.println("\nPetugas : "+petugas);
    }
    
}
