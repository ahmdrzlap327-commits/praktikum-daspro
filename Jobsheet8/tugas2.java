package Jobsheet8;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        // Validasi input minimal 3 
        if (n < 3) {
            System.out.println("Nilai n minimal harus 3.");
        } else {
            // Outer loop (Baris)
            for (int i = 1; i <= n; i++) {
                // Inner loop (Kolom)
                for (int j = 1; j <= n; j++) {
                    
                    // Cek apakah posisi ada di tepi
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " "); // Cetak angka jika di tepi
                    } else {
                        System.out.print("  "); // Cetak spasi jika di tengah
                    }
                }
                // Pindah baris setelah 1 baris selesai dicetak
                System.out.println();
            }
        }
    }
}