package Jobsheet6;
import java.util.Scanner;
public class siakadFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100, lulus=0, tidaklulus=0;
        for (int i=1; i<=10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai>tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai > 60){
                lulus+=1;
            }else {
                tidaklulus+=1;
            }
        }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("NIlai terendah: " + terendah);
            System.out.println("Total Mahasiswa yang lulus: "+ lulus);
            System.out.println("Total Mahasiswa yang tidak lulus: "+ tidaklulus);
    }
}
