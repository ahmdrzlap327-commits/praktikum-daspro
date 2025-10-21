package Jobsheet6;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totaljual, hargaTiket=50000, jumlahTiket, totaltiket=0, jumlahHarga=0, totalPelanggan, jumlahhargatiket=0;

        System.out.print("masukan total pelanggan hari ini: ");
        totalPelanggan=sc.nextInt();
        for (int i=0; i<totalPelanggan; i++) {
            System.out.print("Masukan total tiket pelanggan ke-"+(i+1)+" adalah ");
            jumlahTiket=sc.nextDouble();
            if (jumlahTiket<=0){
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }
            totaltiket+=jumlahTiket;
            if (jumlahTiket>10){
                jumlahHarga=jumlahTiket*0.85*hargaTiket;
                jumlahhargatiket+=jumlahHarga;
            } else if (jumlahTiket>4){
                jumlahHarga=jumlahTiket*0.9*hargaTiket;
                jumlahhargatiket+=jumlahHarga;
            } else {
                jumlahHarga=hargaTiket*jumlahTiket;
                jumlahhargatiket+=jumlahHarga;
            }
            System.out.println("Harga yang harus dibayarkan: "+ jumlahHarga);
            
        }
        System.out.println("jumlah total pembelian tiket pada hari ini adalah "+totaltiket);
        System.out.println("jumlah total harga tiket yang terjual hari ini adlah "+ jumlahhargatiket);
        
    }
    
}
