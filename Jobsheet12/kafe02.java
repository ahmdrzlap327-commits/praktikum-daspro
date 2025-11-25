package Jobsheet12;
import java.util.Scanner;
public class kafe02 {
    public static void menu (String namaPelanggan, boolean isMember, String diskon){
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan 10% untuk setiap pembelian");
        }
        if (diskon.equals("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 30%!");
        } if (diskon.equals("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%!");
        } else {
            System.out.println("Kode yang ada input invalid!");
        }

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

    public static int hitungTotalHarga (int pilihanMenu, int banyakItem){
        int hargaItem [] = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu-1] * banyakItem; 
        return hargaTotal;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("Budi", true, "DISKON30");

        System.out.print("\nMasukan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int hargaTotal = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan anda: Rp. " + hargaTotal);
    }
}
