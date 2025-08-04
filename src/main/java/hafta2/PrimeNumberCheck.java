package hafta2;

import java.util.Scanner;

public class PrimeNumberCheck {

    // Recursive method to check if a number is prime
    static boolean isPrime(int number, int divisor) {
        if (number < 2)
            return false;
        if (divisor == 1)
            return true;
        if (number % divisor == 0)
            return false;
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Start checking from inputNumber - 1
        if (isPrime(inputNumber, inputNumber - 1)) {
            System.out.println(inputNumber + " is a prime number!");
        } else {
            System.out.println(inputNumber + " is not a prime number!");
        }

    }
}