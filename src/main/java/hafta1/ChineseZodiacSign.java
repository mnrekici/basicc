package hafta1;
import java.util.Scanner;
public class ChineseZodiacSign {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Ask the user to enter their birth year
        System.out.println("Doğum yılınızı giriniz:");
        int year_birth = scanner.nextInt();

        // Calculate the remainder when the birth year is divided by 12
        int remainder = year_birth %12;

        // Determine the Chinese Zodiac sign based on the remainder
        if(remainder==0){
            System.out.println("Çin zodyağı burcunuz :" + "Maymun");
        }else if (remainder==1){
            System.out.println("Çin zodyağı burcunuz:" + "Horoz");
        }else if (remainder==2){
            System.out.println("Çin zodyağı burcunuz:" + "Köpek");
        }else if (remainder==3){
            System.out.println("Çin zodyağı burcunuz:" + "Domuz");
        }else if (remainder==4){
            System.out.println("Çin zodyağı burcunuz:" + "Fare");
        }else if (remainder==5){
            System.out.println("Çin zodyağı burcunuz:" + "Öküz");
        }else if (remainder==6){
            System.out.println("Çin zodyağı burcunuz:" + "Kaplan");
        }else if (remainder==7){
            System.out.println("Çin zodyağı burcunuz:" + "Tavşan");
        }else if (remainder==8){
            System.out.println("Çin zodyağı burcunuz:" + "Ejderha");
        }else if (remainder==9){
            System.out.println("Çin zodyağı burcunuz:" + "Yılan");
        }else if (remainder==10){
            System.out.println("Çin zodyağı burcunuz:" + "At");
        }else if (remainder==11){
            System.out.println("Çin zodyağı burcunuz:" + "Koyun");
        }


    }
}
