package Jobsheet14;
import java.util.Scanner;
public class tugas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int jumlah;

        System.out.print("Masukan jumlah angka yang ingin dihitung (N): ");
        jumlah = sc.nextInt();
        
        System.out.println(penjumlahanIterasi(jumlah));
        System.out.println(penjumlahanRekursif(jumlah));
    }

    static int penjumlahanIterasi (int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukan angka ke-" + i + " : ");
            int angka = sc.nextInt();
            total += angka;
        }
        return (total);
    }

    static int penjumlahanRekursif (int n) {
        if (n == 0) {
            return(0);
        } else {
            System.out.print("Masukan angka ke-" + n + " : ");
            int angka = sc.nextInt();
            return angka + penjumlahanRekursif(n-1);
        }
    }
}
