package hafta2;

import java.util.Scanner;

public class PalindromNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
    }
    private static boolean isPalindrom(int number){
        int originalNumber = number;
        int reversedNumber= 0;

        while(number>0){
            int digit = number%10;
            reversedNumber= (reversedNumber*10) + digit;
            number/= 10;
        }

        return originalNumber == reversedNumber;
    }

}
