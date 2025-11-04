package Jobsheet9;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Masukan jumlah pesanan yang anda beli: "); //jumlah pesanan (input dari pengguna)
        int jumlah = sc.nextInt();
        sc.nextLine();

        String namaMknMnm [] = new String [jumlah]; 
        int hargaMknMnm [] = new int [jumlah];
        int total = 0;

        //nama makanan/minuman dan harga untuk masing-masing pesanan (input dari pengguna)
        for (int i = 0; i < hargaMknMnm.length; i++) {
            //Proses
            //simpan data pesanan dalam array satu dimensi untuk nama pesanan; dan array satu dimensi terpisah untuk harga
            System.out.print("Masukan nama makanan / minuman ke-" + ((i)+1) + ": ");
            namaMknMnm[i] = sc.nextLine();
            System.out.print("Masukan harga dari makanan / minuman ke-" + ((i)+1) + ": ");
            hargaMknMnm [i] = sc.nextInt();
            sc.nextLine();

            total += hargaMknMnm [i]; //hitung total biaya dari semua pesanan yang dimasukkan.
        }
        
        //tampilkan daftar pesanan yang telah dimasukkan bersama dengan total biaya.
        System.out.print("Daftar pesanan yang telah dibeli: ");

        //output
        //daftar pesanan dan total biaya dari semua pesanan.
        for (int i = 0; i < hargaMknMnm.length; i++) {
            System.out.print(namaMknMnm [i] + ", ");
        }
        System.out.println();
        System.out.println("Harga total dari makanan atau minuman yang telah dipesan: " + total);
    }  
}
