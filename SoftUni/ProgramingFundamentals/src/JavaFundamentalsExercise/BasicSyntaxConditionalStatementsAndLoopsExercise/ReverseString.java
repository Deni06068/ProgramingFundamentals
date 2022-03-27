package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char n = '1';
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            n = word.charAt(i);
            reverse = n + reverse;
        }
        System.out.println(reverse);
    }
}
