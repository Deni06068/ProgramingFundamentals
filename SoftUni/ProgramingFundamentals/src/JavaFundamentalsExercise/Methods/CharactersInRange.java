package JavaFundamentalsExercise.Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printCharacterInRange(start, end);

    }
    public static void printCharacterInRange(char start, char end){
        if (start < end) {
            for (int i = start + 1; i < end; i++) {
                System.out.printf("%c ", i);
            }
        }else {
            for (int i = end + 1; i < start; i++) {
                System.out.printf("%c ", i);
            }
        }

    }
}
