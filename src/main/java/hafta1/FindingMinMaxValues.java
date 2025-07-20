package hafta1;

import java.util.Scanner;

public class FindingMinMaxValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to enter
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // Ask for the first number
        System.out.print("1. Sayıyı giriniz: ");
        int number = scanner.nextInt();

        // Set both smallest and biggest to the first number
        int smallest = number;
        int biggest = number;

        // Loop from the 2nd number to the nth number
        for(int i = 2; i<=n ; i++) {
            System.out.print(i + ". sayıyı giriniz:");
            number = scanner.nextInt();

            // If the new number is bigger than the current biggest, update biggest
            if(number>biggest){
                biggest=number;
            }
            // If the new number is smaller than the current smallest, update smallest
            else if (number<smallest){
                smallest=number;
            }
        }
        // Display the results
        System.out.println("En küçük sayı:" + smallest);
        System.out.println("En büyük sayı:" + biggest);

    }
}

