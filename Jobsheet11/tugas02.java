package Jobsheet11;
import java.util.Scanner;

public class tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== INPUT DATA SURVEI KEPUASAN PELANGGAN ===");

        // a. Menyimpan hasil survey
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=============================================");
        System.out.println("HASIL PERHITUNGAN NILAI");

        // b. Rata-rata setiap responden
        System.out.println("\nRata-rata setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }
            double rataResponden = total / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataResponden);
        }

        // c. Rata-rata setiap pertanyaan
        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            double rataPertanyaan = total / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPertanyaan);
        }

        // d. Rata-rata keseluruhan
        double totalSemua = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata keseluruhan survei: " + rataKeseluruhan);

        sc.close();
    }
}
