package hafta2;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the base number
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        // Ask the user to enter the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;

        // Multiply the base by itself exponent times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
