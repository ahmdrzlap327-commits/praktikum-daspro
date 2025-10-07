package Jobsheet5;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        String pesan = (uktLunas)
                ? "KRS dapat dicetak."
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(pesan);
    }
}
