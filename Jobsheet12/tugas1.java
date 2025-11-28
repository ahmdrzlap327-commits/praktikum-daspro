package Jobsheet12;
import java.util.Scanner;
public class tugas1 {

    static int volume (int panjang){
        int volum = panjang * panjang * panjang;
        return volum;
    }

    static int luas (int panjang){
        int luasPermukaan = panjang * panjang * 6;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan sisi kubus: ");
        int sisi = sc.nextInt();

        int vol = volume(sisi);
        int Lper = luas(sisi);
        System.out.println("Volume kubus adalah: " + vol );
        System.out.println("Luas permukaan kubus adalah " + Lper);

        sc.close();

    }
}
