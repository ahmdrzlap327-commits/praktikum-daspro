package Jobsheet9;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        int [] nilaiMhs = new int [jml];
        int nilaiTotal = 0, tertinggi = 0, terendah = 100;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + ((i)+1) + ": ");
            nilaiMhs [i] = sc.nextInt();
            nilaiTotal += nilaiMhs[i];
            if (nilaiMhs [i]>tertinggi) {
                tertinggi = nilaiMhs [i];    
            } if (nilaiMhs [i]<terendah) {
                    terendah = nilaiMhs [i];
                }  
        }

        rata2 = nilaiTotal / nilaiMhs.length;
        System.out.println();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + ((i)+1) + " adalah " + nilaiMhs[i]);
        }

        System.out.println();
        System.out.println("Rata-rata nilai mahasiswa adalah " + rata2);
        System.out.println("Dengan nilai tertinggi yang diperoleh: " + tertinggi);
        System.out.println("Dan nilai terendah yang diperoleh: " + terendah);
    }
}
