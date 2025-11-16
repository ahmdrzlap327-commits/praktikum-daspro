package Jobsheet11;
import java.util.Scanner;
public class bioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom, pilihan, baris1, kolom1;

        String [] [] penonton = new String [4] [2];

        // while (true) {
        //     System.out.print("Masukan nama: ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukan baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukan kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();
            
        //     penonton [baris-1] [kolom-1] = nama;

        //     System.out.print("Input penonton lainnya? (y/n)");
        //     next = sc.nextLine();

        //     if (next.equalsIgnoreCase("n")) {
        //         break;
        //     }
        // }

        // System.out.println("Daftar penonton: ");
        // for (int i = 0; i < penonton.length; i++) {
        //     for (int j = 0; j < penonton[i].length; j++) {
        //         System.out.println("- "  + penonton [i][j]);   
        //     }
        // }

        do {
            System.out.println("\n===== MENU BIOSKOP MINI =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor baris (0-3): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan nomor kolom (0-1): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2) {
                        System.out.println("Nomor kursi tidak tersedia!");
                    } else if (penonton[baris][kolom] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris][kolom]);
                    } else {
                        System.out.print("Masukkan nama penonton: ");
                        nama = sc.nextLine();
                        penonton[baris][kolom] = nama;
                        System.out.println("Data penonton berhasil disimpan!");
                    }
                    break;

                case 2:
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);
    }
}
