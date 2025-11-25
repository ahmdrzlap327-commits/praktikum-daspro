package Jobsheet12;
import java.util.Scanner;
public class pengunjungCafe02 {
    static void daftarPengunjung (String...namaPengunjung){
        System.out.println("Daftar nama pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Cinta");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
