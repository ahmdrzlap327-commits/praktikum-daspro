package Jobsheet9;
import java.util.Scanner;
public class searchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();
        int [] arrNilai = new int [n];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            arrNilai [i] = sc.nextInt();
        }
        System.out.print("Masukan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (key == hasil) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        // System.out.println();
        // System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        // System.out.println();
    }
}
