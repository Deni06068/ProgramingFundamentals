package JavaFundamentalsExercise.PracticeTests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(message);

        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");
            switch (command[0]) {
                case "InsertSpace":
                    if (Integer.parseInt(command[1]) <= sb.length()) {
                        sb.insert(Integer.parseInt(command[1]), " ");
                    }
                    System.out.println(sb);
                    break;
                case "Reverse":
                    if (sb.toString().contains(command[1])) {
                        int startIndex = sb.indexOf(command[1]);
                        StringBuilder sbToReverse = new StringBuilder(sb.substring(startIndex, startIndex + command[1].length()));
                        sbToReverse.reverse();
                        sb.delete(startIndex, startIndex + command[1].length());
                        sb.append(sbToReverse);
                        System.out.println(sb);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    while (sb.toString().contains(command[1])) {
                        int startIndex = sb.indexOf(command[1]);
                        sb.replace(startIndex, startIndex + command[1].length(), command[2]);
                    }
                    System.out.println(sb);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + sb);
    }
}
