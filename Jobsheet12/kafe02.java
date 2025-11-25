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
    public static void main(String[] args) {
        menu("Andi", true, "DISKON50");
    }
}
