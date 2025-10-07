package Jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan = "";

        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Jumlah bimbingan dengan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Jumlah bimbingan dengan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Anda dapat mendaftar ujian skripsi.";
                } else {
                    pesan = "Bimbingan dengan pembimbing 2 belum mencukupi (minimal 4 kali).";
                }
            } else {
                pesan = "Bimbingan dengan pembimbing 1 belum mencukupi (minimal 8 kali).";
            }
        } else {
            pesan = "Registrasi ujian ditolak. Anda masih memiliki kompen.";
        }

        System.out.println(pesan);
    }
}
