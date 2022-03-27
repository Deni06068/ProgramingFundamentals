package JavaFundamentalsExercise.Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("");

        System.out.println(returnMiddleChar(text));

    }
    public static String returnMiddleChar (String[] text){
        int middleChar = text.length / 2;
        if (text.length % 2 == 0){
            return text[middleChar - 1] + text[middleChar];
        }else {
            return text[middleChar];
        }
    }
}
