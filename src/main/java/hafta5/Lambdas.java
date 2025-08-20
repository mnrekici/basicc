package hafta5;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Sayıları iki katına çıkarma
        numbers.replaceAll(n -> n * 2);
        // Sonuçları yazdırma (lambda ile)
        numbers.forEach(n-> System.out.println(n));
    }
}
