package Jobsheet12;
import java.util.Scanner;
public class tugas3 {
    // private static final String[] NAMA_MENU = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    // private static final int JUMLAH_HARI = 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan Jumlah Hari Penjualan: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String[] namaMenu = new String[jumlahMenu];
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan Nama Menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        int [][] data = input(sc, jumlahMenu, jumlahHari);
        tampilan(data, namaMenu, jumlahHari);
        tertinggi(data, namaMenu);
        rata2(data, namaMenu, jumlahHari);

        sc.close();
    }

    static int [][] input (Scanner sc, int jmlMenu, int jmlHari){
        int [][] hasil = new int [jmlMenu][jmlHari];
        System.out.println("--- INPUT DATA PENJUALAN (" + jmlMenu + " Menu x " + jmlHari + " Hari) ---");

        for (int i = 0; i < hasil.length; i++) {
            System.out.println("Input Penjualan untuk Menu ke-" + (i + 1) + ":");
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print("  Hari ke-" + (j+1) + " (unit): ");
                hasil [i][j] = sc.nextInt();
            }
        }
        return hasil;
    }

    static void tampilan(int [][] data, String[] namaMenu, int jmlHari){
        System.out.println("\n--- TAMPILAN DATA PENJUALAN HARIAN ---"); 
        System.out.printf("%-15s", "Menu");

        for (int j = 1; j <= jmlHari; j++) {
            System.out.printf("%-5s", "H" + j);
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-5d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }

    static void tertinggi (int data [][], String[] namaMenu){
        int tertinggi = 0;
        int menu = 0;
        System.out.println("\n--- PERHITUNGAN TOTAL PENJUALAN ---");
        for (int i = 0; i < data.length; i++) {
            int total=0;    
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            System.out.println(namaMenu[i] + " mempunyai total penjualan: " + total + " unit");
            if (total>tertinggi) {
                tertinggi = total;
                menu = i;
            }
        }
        System.out.println("Menu dengan total penjualan tertinggi adalah " + namaMenu[menu] + " dengan total: " + tertinggi);    
    }

    static void rata2 (int [][] data, String[] namaMenu, int jmlHari){
        System.out.println("\n--- RATA-RATA PENJUALAN PER MENU ---");
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rataRata = (double) total / jmlHari;

            System.out.printf("Rata-rata penjualan %-15s: %.2f unit/hari\n", namaMenu[i], rataRata);
        }
    }
}
