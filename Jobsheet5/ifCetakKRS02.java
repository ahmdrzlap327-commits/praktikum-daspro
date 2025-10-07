package Jobsheet5;
import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/flase): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = (uktLunas)
                ? "KRS dapat dicetak. \nsilahkan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(pesan);
    }
    
}
