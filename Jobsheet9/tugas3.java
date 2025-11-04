package Jobsheet9;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu yang tersedia: ");
        System.out.println("Makanan: Nasi goreng, Mie goreng, Roti bakar, Kentang goreng");
        System.out.println("Minuman: Teh Tarik, Cappucino, Chocolate ice");

        //input
        System.out.print("Masukan jumlah pesanan yang akan anda beli: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        //daftar menu makanan yang telah ditentukan sebelumnya dalam bentuk array. Nama-nama makanan telah di-inisialisasi saat deklarasi array. Misal: String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String [] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};
        
        String key;
        for (int i = 0; i < jumlah; i++) {
            System.out.print(((i)+1) + " Masukan nama makanan / minuman yang anda pesan: "); //nama makanan yang ingin dicari (input dari pengguna).
            key = sc.nextLine();
            //Proses
            //program mencari nama makanan yang dimasukkan pengguna menggunakan algoritma linear search.
            for (int j = 0; j < menu.length; j++) {
                if (key.equalsIgnoreCase(menu[j])) { //jika makanan ditemukan, program akan menginformasikan pengguna bahwa makanan tersebut tersedia.
                    System.out.println("baik menu sedang tersedia!"); // Tampilkan hasil pencarian kepada pengguna.
                    break;
                } else { //. Jika tidak ditemukan, program akan memberi tahu pengguna bahwa makanan yang dicari tidak ada di menu.
                    System.out.println("Mohon maaf menu yang anda ketik sedang tidak ada!"); //Tampilkan hasil pencarian kepada pengguna.
                    break;
                }
            }       
        }
    }  
}
