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
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //deklarasi variabel
        int i;
        int saldoAwal;
        int bunga; // persen bunga
        int jbunga; // jumlah bunga
        int saldoTarget;
        
        //variabel yang diberi value
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
        //proses looping sampai mencapai target
        i=1; //inisialisasi variabel i=1
        while (saldoAwal <= saldoTarget) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            //menampilkan dengan format tertentu
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;//increase variabel i -> untuk mengontrol perhitungan bulan
    }
    
}
}