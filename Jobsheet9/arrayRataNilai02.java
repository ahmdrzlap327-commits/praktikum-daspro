package Jobsheet9;
import java.util.Scanner;
public class arrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiMahasiswa = new int [10];
        double total = 0, rata2;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + " : ");
            nilaiMahasiswa [i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        rata2 = total/nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
