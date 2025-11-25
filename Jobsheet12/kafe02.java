package Jobsheet12;
import java.util.Scanner;
public class kafe02 {
    public static void menu (){
        // System.out.println("Selamat datang " + namaPelanggan + "!");

        // if (isMember) {
        //     System.out.println("Anda adalah member, dapatkan 10% untuk setiap pembelian");
        // }

        // if (diskon.equals("DISKON30")) {
        //     System.out.println("Selamat anda mendapatkan diskon sebesar 30%!");
        // } if (diskon.equals("DISKON50")) {
        //     System.out.println("Selamat anda mendapatkan diskon sebesar 50%!");
        // } else {
        //     System.out.println("Kode yang ada input invalid!");
        // }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan: ");
    }

    public static double hitungTotalHarga (int pilihanMenu, int banyakItem, String kodeDiskon){
        int hargaItem [] = {15000, 20000, 22000, 12000, 10000, 18000};

        double diskon;        
        if (kodeDiskon.equals("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 30%!");
            System.out.println("Diskon sebesar: " + (hargaItem[pilihanMenu-1] * banyakItem * 0.3));
            diskon = 0.7;
        } else if (kodeDiskon.equals("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%!");
            System.out.println("Diskon sebesar: " + (hargaItem[pilihanMenu-1] * banyakItem * 0.5));
            diskon = 0.5;
        } else {
            System.out.println("Kode yang anda input invalid!");
            diskon = 1;
        }

        double hargaTotal = hargaItem[pilihanMenu-1] * banyakItem * diskon; 
        return hargaTotal;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        boolean pesanLagi = true;
        while (pesanLagi) {
            menu();
            
            System.out.print("\nMasukan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukan kode diskon nya: ");
            String kode = sc.nextLine();

            double hargaTotal = hitungTotalHarga(pilihanMenu, banyakItem, kode);
            totalKeseluruhan += hargaTotal;
            System.out.printf("Harga untuk pesanan ini adalah: %.2f%n", hargaTotal);

            System.out.print("Apakah anda ingin memesan menu yang lain? (y/n)");
            String ulang = sc.nextLine();
            if (ulang.equalsIgnoreCase("n")) {
                pesanLagi = false;
            }
        }
        System.out.println("Total harga untuk pesanan anda: Rp. " + totalKeseluruhan);

       
    }
}
