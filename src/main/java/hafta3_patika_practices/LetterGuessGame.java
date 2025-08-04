package hafta3_patika_practices;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterGuessGame {
    public static void main(String[] args) {
        ArrayList<String> letterList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Manual letter list (not random)
        letterList.add("e");
        letterList.add("g");
        letterList.add("f");
        letterList.add("m");

        System.out.println("Initial list: " + letterList);

        for(int i=0; i<4 ;i++){
            System.out.print("Enter letter " + (i+1) + ":");
            String userLetter = scanner.nextLine().toLowerCase();

            boolean isFound = false;

            for (int j = 0; j < letterList.size(); j++) {
                if (letterList.get(j).equals(userLetter)) {
                    letterList.set(j, "found");
                    isFound = true;
                }
            }

            if (!isFound) {
                letterList.add(userLetter);
            }
        }

        System.out.println("Updated list: " + letterList);
    }
}