package hafta1;

import java.util.Scanner;

public class BodyMassIndex
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinde giriniz:");
        double height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz:");
        double weight = scanner.nextDouble();

        double body_mass_index = weight / (height * height);
        System.out.println("Vücut kitle indeksiniz: " + body_mass_index);
    }
}
