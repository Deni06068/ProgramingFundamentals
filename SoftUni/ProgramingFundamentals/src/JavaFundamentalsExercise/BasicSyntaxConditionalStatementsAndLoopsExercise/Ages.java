package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        String type = "";

        if (0 <= age && age <= 2) {
            type = "baby";
        } else if (3 <= age && age <= 13) {
            type = "child";
        } else if (14 <= age && age <= 19) {
            type = "teenager";
        } else if (20 <= age && age <= 65) {
            type = "adult";
        } else if (66 <= age) {
            type = "elder";
        }

        System.out.println(type);
    }
}
