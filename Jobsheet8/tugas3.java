package Jobsheet8;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grandTotalPelanggan = 0;
        int grandTotalItem = 0;

        // 1. Meminta input jumlah cabang 
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        System.out.println("== Input Penjualan Per Cabang ==");

        // 2. Outer loop: Berulang untuk setiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("Cabang " + i);

            // Meminta input jumlah pelanggan 
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0; // Reset total item untuk setiap cabang baru

            // 3. Inner loop: Berulang untuk setiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                // Meminta input jumlah item per pelanggan 
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem; // Akumulasi item per cabang
            }

            // 4. Menampilkan ringkasan per cabang 
            System.out.println("Cabang " + i + ":");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItemCabang);
            System.out.println(); // Kasih jarak

            // Akumulasi untuk total keseluruhan
            grandTotalPelanggan += jumlahPelanggan;
            grandTotalItem += totalItemCabang;
        }

        // 5. Menampilkan ringkasan total keseluruhan [cite: 256, 272]
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + grandTotalPelanggan + " orang");
        System.out.println("Item terjual: " + grandTotalItem + " item");
    }
}