package JavaFundamentalsExercise.Exam;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLines = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("!(?<command>[A-Z][A-Za-z]{2,})!:\\[(?<String>[A-Za-z]{8,})]");

        for (int i = 0; i < countLines; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();
            if (matcher.find()){
                String string = matcher.group("String");
                for (int j = 0; j < string.length(); j++) {
                    if (j == string.length() - 1) {
                        sb.append((int) string.charAt(j));
                    }else {
                        sb.append((int) string.charAt(j));
                        sb.append(" ");
                    }
                }
                System.out.println(matcher.group("command") + ": " + sb);
            }else {
                System.out.println("The message is invalid");
            }
        }
    }
}
