package hafta2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAPIFormatingMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // ISO_LOCAL_DATE is valid for LocalDate
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(today.format(dateTimeFormatter));

        // Custom pattern
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        String stringDate = "25/01/2026";
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(stringDate, formatter);

        System.out.println("İleri tarih: " + localDate);
    }
}

