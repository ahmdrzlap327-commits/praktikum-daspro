package Jobsheet12;
import java.util.Scanner;
public class pengunjungCafe02 {
    static void daftarPengunjung (String...namaPengunjung){
        System.out.println("Daftar nama pengunjung: ");
        for (String listNama : namaPengunjung) {
            System.out.println("- " + listNama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Cinta");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
