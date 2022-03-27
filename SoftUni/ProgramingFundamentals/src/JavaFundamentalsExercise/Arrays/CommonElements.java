package JavaFundamentalsExercise.Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] wordsFirstLine = firstLine.split(" ");
        String[] wordsSecondLine = secondLine.split(" ");

        for (String oneWordSecondLine : wordsSecondLine) {
            for (String oneWordFirstLine : wordsFirstLine) {
                if (oneWordSecondLine.equals(oneWordFirstLine)){
                    System.out.print(oneWordSecondLine + " ");
                }
            }
        }
    }
}
