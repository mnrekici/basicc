package hafta1;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int travelType = scanner.nextInt();

        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Invalid input!");
        } else {
            double pricePerKm = 0.10;
            double baseFare = distance * pricePerKm;
            double discount = 0;

            // Age discount
            if (age < 12) {
                discount = 0.50;
            } else if (age >= 12 && age <= 24) {
                discount = 0.10;
            } else if (age > 65) {
                discount = 0.30;
            }

            double discountedFare = baseFare - (baseFare * discount);

            // Round trip discount
            if (travelType == 2) {
                discountedFare = discountedFare - (discountedFare * 0.20);
                discountedFare *= 2;
            }

            System.out.println("Total Fare = " + discountedFare + " TL");
        }
    }
}
