package Jobsheet9;
import java.util.Scanner;
public class searchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();
        int [] arrNilai = new int [n];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + ((i)+1) + ": ");
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
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1)); 
        } else {
             System.out.println("Nilai yang dicari tidak ditemukan"); 
        }
    }
}
