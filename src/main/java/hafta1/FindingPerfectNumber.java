package hafta1;

import java.util.Scanner;

public class FindingPerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Variable to hold the sum of the divisors
        int total =0;

        for(int i = 1; i<number ; i++) {

            if(number%i ==0){
                total+=i;
            }
        }
        // Check if the number is a perfect number
        if(total==number){
            System.out.println(number + " mükemmel bir sayıdır.");
        }else {
            System.out.println(number + " mükemmel bir sayı değildir");
        }
    }
}
