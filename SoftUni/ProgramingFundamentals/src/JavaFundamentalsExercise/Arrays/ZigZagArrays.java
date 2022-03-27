package JavaFundamentalsExercise.Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String firstLine = "";
        String secondLine = "";
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (i % 2 == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    firstLine = firstLine + numbers[0] + " ";
                    secondLine = secondLine + numbers[1] + " ";
                    break;
                }
            } else {
                for (int j = 0; j < numbers.length; j++) {
                    firstLine = firstLine + numbers[1] + " ";
                    secondLine = secondLine + numbers[0] + " ";
                    break;
                }
            }
        }
        System.out.println(firstLine);
        System.out.println(secondLine);
    }
}
