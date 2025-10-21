package Jobsheet6;
import java.util.Scanner;
public class tugas2noAbsen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;
       

        do {
             System.out.print("Masukan jenis kendaraan (1.mobil 2. Motor 0. keluar): ");
             jenis = sc.nextInt();
                if (jenis==1||jenis==2){
                System.out.print("Masukan Durasi parkir anda: ");
                durasi = sc.nextInt();
                if (durasi>=5){
                    total+=12500;
                }else if (jenis==1){
                    total+=durasi*3000;
                }else if (jenis==2){
                    total+=durasi*2000;
                }
                System.out.println("Harga parkir yang harus dibayarkan: "+total);
            } 
        } while(jenis!=0);
        

    }
}