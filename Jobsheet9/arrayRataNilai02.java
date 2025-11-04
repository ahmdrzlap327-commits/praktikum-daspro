package Jobsheet9;
import java.util.Scanner;
public class arrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int [] nilaiMahasiswa = new int [jumlahMhs];
        double total = 0, totalLulus = 0, totalTidaklulus = 0, rata2, rata2lulus, rata2tidaklolos;
        int lulus = 0, tidakLulus = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + ((i)+1) + " : ");
            nilaiMahasiswa [i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa [i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                lulus += 1;
            } else {
                totalTidaklulus += nilaiMahasiswa[i];
                tidakLulus += 1;
            }
        }
        rata2 = total/nilaiMahasiswa.length;
        rata2lulus = totalLulus/lulus;
        rata2tidaklolos = totalTidaklulus/tidakLulus;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Banyak mahasiswa yang lulus: " + lulus);
        System.out.println("dengan rata-rata: " + rata2lulus);
        System.out.println("Banyak Mahasiswa yang tidak lulus: " + tidakLulus);
        System.out.println("Dengan rata-rata: " + rata2tidaklolos);
    }
}
