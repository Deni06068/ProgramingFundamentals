package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStart = Integer.parseInt(scanner.nextLine());
        int numEnd = Integer.parseInt(scanner.nextLine());

        for (int i = numStart; i <= numEnd; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");

        }
    }
}
