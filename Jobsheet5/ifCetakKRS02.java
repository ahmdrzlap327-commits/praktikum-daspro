package Jobsheet5;
import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/flase): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }

        

    }
    
}
