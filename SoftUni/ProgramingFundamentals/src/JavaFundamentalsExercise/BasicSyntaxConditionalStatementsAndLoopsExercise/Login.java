package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String reverse = "";
        String password = "";
        boolean isLoggedIn = true;
        int trying = 0;

        int length = username.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + username.charAt(i);
        }


        for (int i = 0; i <= 3; i++) {
            password = scanner.nextLine();
            trying++;
            if (password.equals(reverse)) {
                isLoggedIn = true;
                break;
            }
            if (trying == 4) {
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                isLoggedIn = false;

            }
        }
        if (isLoggedIn) {
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
