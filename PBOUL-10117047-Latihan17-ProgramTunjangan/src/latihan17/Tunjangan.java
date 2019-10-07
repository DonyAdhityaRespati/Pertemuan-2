package Latihan17;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Dony Adhitya Respati
 * KELAS    : PBOUL
 * NIM      : 10117047
 * Deskripsi Program : Menghitung total gaji berdasarkan status pernikahan
 * dengan ketentuan jika sudah menikah mendapatkan tunjangan 35%(dari gaji pokok)
 * jika belum maka tidak mendapatkan tunjangan
 * 
 */
public class Tunjangan {

    public static void main(String[] args) {
        // deklarasi variabel
        String status;
        double tunj;
        double gaji;
        double gatot;
        //membuat scanner input data
        Scanner scn = new Scanner(System.in);
        
        // menampilkan template program
        System.out.println("********Program Tunjangan********");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp.");
        gaji = scn.nextDouble();
        // input harus huruf Capitalize (huruf depannya kapital)
        System.out.print("Status Anda? (Menikah/Belum) :");
        status = scn.next();
        
        // kondisional tunjangan dengan menggunakan ?: 
        tunj=(status.equals("Menikah")?0.35*gaji:0);
        // gatot = gaji total
        gatot = gaji+tunj;
        
        // menampilkan hasil setelah perhitungan
        System.out.println("");
        System.out.println("********Hasil Perhitungan********");
        System.out.println("Gaji Pokok\t : Rp "+gaji);
        System.out.println("Tunjangan\t : Rp "+tunj);
        System.out.println("Total gaji\t : Rp "+gatot);
        System.out.println("(Developed by: Dony Adhitya Respati)");
    }
    
}
