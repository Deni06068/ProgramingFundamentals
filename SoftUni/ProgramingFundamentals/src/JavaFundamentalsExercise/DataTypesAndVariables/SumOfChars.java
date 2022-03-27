package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < lines; i++) {
            String letters = scanner.nextLine();
            int num = letters.charAt(0);
            sum += num;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
