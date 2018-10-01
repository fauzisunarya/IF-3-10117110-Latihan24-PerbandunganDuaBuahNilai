


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 *Perbandingan dua nilai lebih besar atau lebih kecil
 */


package pkgif.pkg3.pkg10117110.latihan24.perbandunganduabuahnilai;

import java.util.Scanner;

public class IF310117110Latihan24PerbandunganDuaBuahNilai {

    public static void main(String[] args) {
        
        boolean running = true;
        
        int Nilai, Nilai2;
        int counter =0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("======Program Perbandingan Nilai======");
        
        while (running){    
        System.out.print("Masukan Nilai Pertama : ");
        Nilai = scan.nextInt();
        System.out.print("Masukan Nilai Kedua : ");
        Nilai2 = scan.nextInt();
        
         if (Nilai<Nilai2){
            System.out.println(Nilai+" Lebih kecil Dari " +Nilai2);
        }else{
            System.out.println(Nilai+" Lebih Besar Dari " +Nilai2);
        }
        
                
        System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
        jawab = scan.next();
        
        if(jawab.equalsIgnoreCase("Tidak") ){
            running = false;
        }
        
        counter++;
            
        }
           System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");


    }
    
}
