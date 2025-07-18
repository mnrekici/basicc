package hafta1;

import java.util.Scanner;

public class GroceryCashRegister {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kilo ?");
        double pear = scanner.nextDouble();

        System.out.println("Elma kaç kilo ?");
        double apple = scanner.nextDouble();

        System.out.println("Domates kaç kilo ?");
        double tomato = scanner.nextDouble();

        System.out.println("Muz kaç kilo ?");
        double banana = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo ?");
        double eggplant = scanner.nextDouble();

        // Define the prices per kilogram for each product
        double pear_price = 2.14;
        double apple_price = 3.67;
        double tomato_price = 1.11;
        double banana_price = 0.95;
        int eggplant_price = 5;

        // Calculate the total cost by multiplying weights with unit prices and summing up
        double total = pear * pear_price + apple * apple_price + tomato * tomato_price + banana * banana_price + eggplant * (double)eggplant_price;


        // Display the total amount to be paid
        System.out.println("Toplam tutar:" + total);
    }
}

