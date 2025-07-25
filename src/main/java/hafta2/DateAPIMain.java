package hafta2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAPIMain {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.now().plusDays(7));
        System.out.println(LocalDate.now().minusDays(4));

        var date = LocalDate.of(2025, 7, 30);
        boolean isBefore = date.isBefore(LocalDate.now());

        if(isBefore) {
            System.out.println("Paket süreniz dolmuştur.");
        }else {
            System.out.println("Paket süreniz devam etmektedir.");
        }



    }
}
