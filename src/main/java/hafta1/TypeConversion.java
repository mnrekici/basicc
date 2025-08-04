package hafta1;

import java.util.Scanner;

public class TypeConversion{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int integerNumber = scanner.nextInt();

        System.out.print("Bir ondaklıklı sayı giriniz: ");
        double decimalNumber = scanner.nextDouble();

        // Convert integer to double
        double intToDouble = (double) integerNumber;

        // Convert double to integer
        int doubleToInt = (int) decimalNumber;

        // Display the results
        System.out.println("\n--- Type Conversion Results ---");
        System.out.println("Original integer: " + integerNumber);
        System.out.println("Integer converted to double: " + intToDouble);
        System.out.println("Original decimal: " + decimalNumber);
        System.out.println("Decimal converted to integer: " + doubleToInt);

    }
}

