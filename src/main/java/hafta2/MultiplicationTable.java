package hafta2;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter upper limit (1-10): "); // Kullanıcıdan üst sınır istenir
        int limit = input.nextInt();

        // Eğer kullanıcı geçersiz bir değer girerse
        if (limit < 1 || limit > 10) {
            System.out.println("Error: Please enter a number between 1 and 10."); // Hata mesajı göster
            return; // Programı sonlandır
        }

        // Geçerli giriş yapıldığında çarpım tablosu yazdırılır
        for (int row = 1; row <= limit; row++) { // Satırlar için döngü
            for (int col = 1; col <= limit; col++) { // Sütunlar için döngü
                System.out.printf("%-4d", row * col); // row * col sonucu hizalanarak yazdırılır
            }
            System.out.println(); // Her satırdan sonra bir alt satıra geçilir
        }
    }
}
