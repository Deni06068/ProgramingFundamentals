package JavaFundamentalsExercise.TextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigInteger = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());
        StringBuilder bigIntegerAsSB = new StringBuilder(bigInteger);
        int count = bigIntegerAsSB.length() - 1;
        int inMind = 0;

        if (multiplier == 0) {
            bigIntegerAsSB.delete(0, bigIntegerAsSB.length());
            bigIntegerAsSB.append(0);
        } else {
            for (int i = bigIntegerAsSB.length() - 1; i >= 0; i--) {
                int num = Integer.parseInt(String.valueOf(bigIntegerAsSB.charAt(i)));
                int product = ((multiplier * num) + inMind) % 10;
                if ((((multiplier * num) + inMind) / 10) > 0) {
                    inMind = ((multiplier * num) + inMind) / 10;
                } else {
                    inMind = 0;
                }
                bigIntegerAsSB.replace(i, i + 1, Integer.toString(product));
                if (i == 0 && inMind > 0) {
                    bigIntegerAsSB.insert(0, inMind);
                }
            }
            while (bigIntegerAsSB.charAt(0) == '0') {
                bigIntegerAsSB.deleteCharAt(0);
            }
        }
        System.out.println(bigIntegerAsSB.toString());
    }
}
