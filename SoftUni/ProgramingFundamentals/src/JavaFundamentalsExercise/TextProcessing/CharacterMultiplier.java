package JavaFundamentalsExercise.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        String word1 = words[0];
        String word2 = words[1];
        int result = 0;

        if (word1.length() > word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                if (word2.length() > i){
                    result = result + (word1.charAt(i) * word2.charAt(i));
                }else {
                    result = result + word1.charAt(i);
                }
            }
        }else {
            for (int i = 0; i < word2.length(); i++) {
                if (word1.length() > i){
                    result = result + (word1.charAt(i) * word2.charAt(i));
                }else {
                    result = result + word2.charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}
