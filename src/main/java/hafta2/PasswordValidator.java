package hafta2;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if the password meets all the rules
        if (password.length() >= 8 &&   //At least 8 characters
                !password.contains(" ") &&  // No space character
                Character.isUpperCase(password.charAt(0)) && //First letter must be uppercase
                password.endsWith("?")) {  //Must end with '?'

            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}

