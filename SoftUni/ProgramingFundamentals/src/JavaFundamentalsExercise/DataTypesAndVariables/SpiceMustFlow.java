package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int allExtracted = 0;

        while (startingYield >= 100) {
            allExtracted+= (startingYield - 26);
            startingYield -= 10;
            days++;
        }
        if (allExtracted >= 26) {
            allExtracted -= 26;
        }
        System.out.println(days);
        System.out.println(allExtracted);
    }
}
