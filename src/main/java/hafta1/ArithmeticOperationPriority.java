package hafta1;

import java.util.Scanner;

public class ArithmeticOperationPriority {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        double a = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz:");
        double b = scanner.nextDouble();

        System.out.println("Üçüncü sayıyı giriniz:");
        double c = scanner.nextDouble();

        double operation= a + b * c - b ;

        System.out.println("İşlem sonucu: " + operation);


    }
}
