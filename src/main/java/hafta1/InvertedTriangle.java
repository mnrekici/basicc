package hafta1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter number of row
        System.out.print("Basamak sayısı giriniz: ");
        int row = scanner.nextInt();

        // Outer loop controls the number of rows
        for (int i = row; i >= 1; i--) {

            // Inner loop prints the stars in each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();

        }
    }
}