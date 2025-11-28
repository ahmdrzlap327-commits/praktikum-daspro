package Jobsheet12;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("ada berapa jumlah mahasiswa? ");
       int jml =  sc.nextInt();

       int nilai [] = new int [jml];
       
       isianArray(nilai, jml, sc);
       tampilArray(nilai);
       int jumlahNilai = hitTot(nilai);
       System.out.println("\nTotal nilai seluruh mahasiswa adalah: " + jumlahNilai);
    }

    static void isianArray (int []nilai, int jumlah, Scanner sc) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai [i] = sc.nextInt();
        }
    }

    static void tampilArray (int[]nilai){
        System.out.println("");
        System.out.println("--- Daftar Nilai Mahasiswa ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static int hitTot (int[] nilai){
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

}
