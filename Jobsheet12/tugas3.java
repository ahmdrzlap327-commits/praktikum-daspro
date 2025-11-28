package Jobsheet12;
import java.util.Scanner;
public class tugas3 {
    private static final String[] NAMA_MENU = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    private static final int JUMLAH_HARI = 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] data = input(sc);
        tampilan(data);
        tertinggi(data);
        rata2(data);

        sc.close();
    }

    static int [][] input (Scanner sc){
        int [][] hasil = new int [NAMA_MENU.length][JUMLAH_HARI];
        System.out.println("--- INPUT DATA PENJUALAN (5 Menu x 7 Hari) ---");

        for (int i = 0; i < hasil.length; i++) {
            System.out.println("Input Penjualan untuk " + NAMA_MENU[i] + ":");
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print("  Hari ke-" + (j+1) + " (unit): ");
                hasil [i][j] = sc.nextInt();
            }
        }
        return hasil;
    }

    static void tampilan(int [][] data){
        System.out.println("\n--- TAMPILAN DATA PENJUALAN HARIAN ---"); 
        System.out.printf("%-15s", "Menu");

        for (int j = 1; j <= JUMLAH_HARI; j++) {
            System.out.printf("%-5s", "H" + j);
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s", NAMA_MENU[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-5d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }

    static void tertinggi (int data [][]){
        int tertinggi = 0;
        int menu = 0;
        System.out.println("\n--- PERHITUNGAN TOTAL PENJUALAN ---");
        for (int i = 0; i < data.length; i++) {
            int total=0;    
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            System.out.println(NAMA_MENU[i] + " mempunyai total penjualan: " + total + " unit");
            if (total>tertinggi) {
                tertinggi = total;
                menu = i;
            }
        }
        System.out.println("Menu dengan total penjualan tertinggi adalah " + NAMA_MENU[menu] + " dengan total: " + tertinggi);    
    }

    static void rata2 (int [][] data){
        System.out.println("\n--- RATA-RATA PENJUALAN PER MENU ---");
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rataRata = (double) total / JUMLAH_HARI;

            System.out.printf("Rata-rata penjualan %-15s: %.2f unit/hari\n", NAMA_MENU[i], rataRata);
        }
    }
}
