package JavaFundamentalsExercise.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    private static int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int num = Integer.parseInt(number);

        returnTopNumber(num, number);

    }

    private static void returnTopNumber(int num, String number) {
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int isOdd = 0;
            String temp = Integer.toString(i);
            int[] digit = Arrays.stream(temp.split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < digit.length; j++) {
                sum += digit[j];
                if (digit[j] % 2 == 0) {

                } else {
                    isOdd += 1;
                }
            }
            if (sum % 8 == 0 && isOdd > 0) {
                System.out.println(i);
            }
        }
    }
}
