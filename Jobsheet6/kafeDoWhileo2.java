package Jobsheet6;
import java.util.Scanner;
public class kafeDoWhileo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargakopi=12000, hargateh=7000, hargaroti=20000, teh, kopi, roti, totalharga;
        String namaPelanggan;
        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi batal");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah rorti: ");
            roti = sc.nextInt();
            sc.nextLine();

            totalharga= (kopi*hargakopi)+(teh*hargateh)+(roti*hargaroti);
            System.out.println("Total yang harus dibayar adalah: "+totalharga);

        } while (true);
        System.out.println("Semua Transaksi selesai.");
    }    
}
