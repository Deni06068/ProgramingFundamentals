package JavaFundamentalsExercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] letters = input.toCharArray();

        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (char letter : letters) {
            if (letter != 32){
                if (lettersCount.containsKey(letter)){
                    lettersCount.put(letter, lettersCount.get(letter) + 1);
                }else {
                    lettersCount.put(letter, 1);
                }
            }
        }

        lettersCount.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
