package Jobsheet9;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu yang tersedia: ");
        System.out.println("Makanan: Nasi goreng, Mie goreng, Roti bakar, Kentang goreng");
        System.out.println("Minuman: Teh Tarik, Cappucino, Chocolate ice");

        System.out.print("Masukan jumlah pesanan yang akan anda beli: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String [] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};
        
        String key;
        for (int i = 0; i < jumlah; i++) {
            System.out.print(((i)+1) + " Masukan nama makanan / minuman yang anda pesan: ");
            key = sc.nextLine();
            for (int j = 0; j < menu.length; j++) {
                if (key.equalsIgnoreCase(menu[j])) {
                    System.out.println("baik menu sedang tersedia!");
                    break;
                } else {
                    System.out.println("Mohon maaf menu yang anda ketik sedang tidak ada!");
                    break;
                }
            }       
        }
    }  
}
