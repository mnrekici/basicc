package hafta1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Yıl giriniz:");
        int year= scanner.nextInt();

        // Check if the year is divisible by 4
        if(year%4 ==0){
            // If the year is also divisible by 100
            if(year%100==0){
                // Then check if it is divisible by 400
                if(year%400==0){
                    // If divisible by 400, it is a leap year
                    System.out.println(year +" bir artık yıldır.");
                }else{
                    // If not divisible by 400, it's not a leap year
                    System.out.println(year +" bir artık yıl değildir.");
                }
            } else {
                // If not divisible by 100, it is a leap year
                System.out.println(year + " bir artık yıldır.");
            }
        }else {
            // If not divisible by 4, it's not a leap year
            System.out.println(year+ " bir artık yıl değildir");
        }
}
}