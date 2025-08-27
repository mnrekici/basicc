package hafta3_patika_practices;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelimeyi giriniz: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : input.toCharArray()){
            if (Character.isLetter(c)){
                frequency.put(c, frequency.getOrDefault(c,0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
