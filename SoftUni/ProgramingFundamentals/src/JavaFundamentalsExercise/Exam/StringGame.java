package JavaFundamentalsExercise.Exam;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String command = scanner.nextLine();
        while (!command.equals("Done")){
            String[] com = command.split(" ");
            switch (com[0]){
                case "Change":
                    String character = com[1];
                    String newCharacter = com[2];
                    for (int i = 0; i < sb.length(); i++) {
                        if (sb.charAt(i) == character.charAt(0)){
                            sb.replace(i, i + 1, newCharacter);
                        }
                    }
                    System.out.println(sb);
                    break;
                case "Includes":
                    String substringIncluded = com[1];
                    if (sb.toString().contains(substringIncluded)) {
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                        break;
                case "End":
                    String substringEnd = com[1];
                    if (sb.toString().contains(substringEnd) && (substringEnd.length() + sb.indexOf(substringEnd)) == sb.length()) {
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    sb = new StringBuilder(sb.toString().toUpperCase());
                    System.out.println(sb);
                    break;
                case "FindIndex":
                    String indexOf = com[1];
                    System.out.println(sb.indexOf(indexOf));
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(com[1]);
                    int count = Integer.parseInt(com[2]);
                    System.out.println(sb.substring(startIndex, startIndex + count));
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
