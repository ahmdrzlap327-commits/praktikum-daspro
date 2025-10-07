package Jobsheet5;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("apakah kamu membawa kartu mahasiswa? (true/false): ");
         boolean kartuMahasiswa = sc.nextBoolean();
         System.out.println("apakah kamu sudah melakukan registrasi online? (true/false)");
         boolean registrasiOnline = sc.nextBoolean();

         if (kartuMahasiswa==true || registrasiOnline==true){
            System.out.println("Boleh masuk perpustakaan");
         }else{
            System.out.println("Tidak bisa masuk perpustakaan");
         }
    }
    
}
