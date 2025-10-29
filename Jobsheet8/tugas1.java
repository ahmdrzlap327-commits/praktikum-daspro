package Jobsheet8;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            int jumlahKuadrat = 0;
            String detailPerhitungan = ""; 

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;
                detailPerhitungan += kuadrat;
                if (j < i) {
                    detailPerhitungan += " + ";
                }
            }

            
            if (i == 1) {
                System.out.println("n=" + i + " -> jumlah kuadrat = " + jumlahKuadrat);
            } else {
                System.out.println("n=" + i + " -> jumlah kuadrat = " + detailPerhitungan + " = " + jumlahKuadrat);
            }
        }
    }
}