package kuis;
import java.util.Scanner;
public class kuis02smt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah daerah yang mengirim donasi: ");
        int jumlahDaerah = sc.nextInt();

        int tabel [][] = new int [jumlahDaerah][3];
        int totalMakanan=0, totalPakaian=0, totalObat=0;

        for (int i = 0; i < jumlahDaerah; i++) {
            System.out.println("Data donasi oleh daerah " + (i+1) + ": ");
            for (int j = 0; j < tabel[i].length; j++) {
                if(j==0){
                    System.out.print("Masukan total makanan yang disumbangkan oleh daerah: ");
                    tabel[i][j] = sc.nextInt();
                    totalMakanan += tabel [i][j];
                } if (j==1) {
                    System.out.print("Masukan total pakaian yang disumbangkan oleh daerah: ");
                    tabel [i][j] = sc.nextInt();
                    totalPakaian += tabel[i][j];
                } if (j==2) {
                    System.out.print("Masukan total obat yang telah disumbangkan oleh daerah: ");
                    tabel [i][j] = sc.nextInt();
                    totalObat += tabel[i][j];
                }
            }
            System.out.println("");
        }

        System.out.println("========================================");
        System.out.println("Total donasi yang telah terkumpul: ");
        System.out.println("========================================");
        System.out.println("");

        for (int i = 0; i < tabel[0].length; i++) {
            System.out.println();
        }

        int tertinggi=0;
        for (int i = 0; i < tabel.length; i++) {
            System.out.print("total bantuan yang telah disumbangkan oleh daerah ke-" + (i+1) + " adalah sebanyak: ");
            int total = 0;
            for (int j = 0; j < tabel[i].length; j++) {
                total += tabel[i][j];
                if (tertinggi<total) {
                    tertinggi = total;
                    // System.out.println();
                }
            }
            System.out.print(total);
            System.out.println("");
        }

        //presentase per kategori
        int presentaseMakanan = totalMakanan / (totalMakanan+totalObat+totalPakaian)*100;
        int presentasePakaian = totalPakaian / (totalMakanan+totalObat+totalPakaian)*100;
        int presentaseObat = totalObat / (totalMakanan+totalObat+totalPakaian)*100;
        System.out.println("");

        //output presentase 
        System.out.println("Total presentase makanan adalah: " + presentaseMakanan + "%");
        System.out.println("Total presentase pakaian adalah: " + presentasePakaian + "%");
        System.out.println("Total presentase obat adalah: " + presentaseObat + "%");
        System.out.println("");

        //total kontribusi dari setiap daerah
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel.length; j++) {
                
            }
        }
        System.out.println("Dengan bantuan ");
    }
}
