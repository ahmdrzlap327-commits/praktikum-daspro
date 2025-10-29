package Jobsheet8;
import java.util.Scanner;
public class nilaiKelompokNoAbsen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, nilai=0, TertinggiKelompok=0;
        float ratanilai=0, totalNilai=0, tertinggiRata=0;
        while (i<=6) {
            System.out.println("Kelompok "+i);
            totalNilai = 0;
            for (int j = 1; j <=5; j++) {
                System.out.print("Nilai dari kelompok penilai "+j+": ");
                nilai = sc.nextInt();
                totalNilai+=nilai;
            }
            ratanilai=totalNilai/5;
            System.out.println("kelompok "+i+" : nilai rata-rata: "+ratanilai);
            if (ratanilai>tertinggiRata){
                tertinggiRata=ratanilai;
                TertinggiKelompok=i;
            }
            i++;
        }
        System.out.println("==============================================");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + TertinggiKelompok);
        System.out.println("Dengan nilai rata-rata: " + tertinggiRata);
    }
}
