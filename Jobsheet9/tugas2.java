package Jobsheet9;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah pesanan yang anda beli: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String namaMknMnm [] = new String [jumlah];
        int hargaMknMnm [] = new int [jumlah];
        int total = 0;

        for (int i = 0; i < hargaMknMnm.length; i++) {
            System.out.print("Masukan nama makanan / minuman ke-" + ((i)+1) + ": ");
            namaMknMnm[i] = sc.nextLine();
            System.out.print("Masukan harga dari makanan / minuman ke-" + ((i)+1) + ": ");
            hargaMknMnm [i] = sc.nextInt();
            sc.nextLine();

            total += hargaMknMnm [i];
        }
        System.out.print("Daftar pesanan yang telah dibeli: ");
        for (int i = 0; i < hargaMknMnm.length; i++) {
            System.out.print(namaMknMnm [i] + ", ");
        }
        System.out.println();
        System.out.println("Harga total dari makanan atau minuman yang telah dipesan: " + total);
    }  
}
