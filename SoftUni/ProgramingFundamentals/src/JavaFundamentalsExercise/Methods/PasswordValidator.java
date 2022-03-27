package JavaFundamentalsExercise.Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        char[] symbol = password.toCharArray();
        boolean flagAlphabeticAndNumber = false;
        boolean flagLength = false;
        int numbers = 0;
        boolean flagNumbers = false;

        if (5 < symbol.length && symbol.length < 10) {
            flagLength = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }

        for (int i = 0; i < symbol.length; i++) {
            flagAlphabeticAndNumber = false;
            if (Character.isAlphabetic(symbol[i])) {
                flagAlphabeticAndNumber = true;
            } else if (Character.isDigit(symbol[i])) {
                flagAlphabeticAndNumber = true;
                numbers++;
            }else {
                break;
            }
        }
        if (!flagAlphabeticAndNumber) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (numbers < 2) {
            System.out.println("Password must have at least 2 digits");
        } else {
            flagNumbers = true;
        }
        if (flagAlphabeticAndNumber && flagLength && flagNumbers) {
            System.out.println("Password is valid");
        }
    }
}
