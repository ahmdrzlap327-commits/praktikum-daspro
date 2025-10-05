import java.util.Scanner;

public class nyobak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas nilai maksimum (N): ");
        int batasMaksimum = input.nextInt();

        int total = 0;
        StringBuilder deretString = new StringBuilder();

        for (int i = 1; i <= batasMaksimum; i++) {
            // Check for Odd/Ganjil (Numbers that are added: +1, +3, +5, ...)
            if (i % 2 != 0) {
                total += i;
                
                // Optimized: Always append '+' for odd numbers (including 1)
                deretString.append("+" + i); 
            } 
            // Check for Even/Genap (Numbers that are subtracted: -2, -4, -6, ...)
            else {
                total -= i;
                
                // Append '-' for even numbers
                deretString.append("-" + i);
            }
        }

        System.out.println("\nHasil penjumlahan berselang-seling:");
        // The toString() method converts the StringBuilder content into the final String
        System.out.println(deretString.toString() + " = " + total);

        input.close();
    }
}