package JavaFundamentalsExercise.TextProcessing;

import java.util.Scanner;


public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        int powerRest = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                int power = Integer.parseInt(String.valueOf(sb.charAt(i + 1))) + powerRest;
                int powerForLoop = power;
                for (int j = 0; j < powerForLoop; j++) {
                    if (i + 1 < sb.length()) {
                        if (sb.charAt(i + 1) != '>') {
                            sb.deleteCharAt(i + 1);
                            power--;
                            powerRest = 0;
                        } else {
                            powerRest = power;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
