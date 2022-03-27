package Lab.ForLoop;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i=0; i < word.length(); i++){
            char oneLetter = word.charAt(i);
            System.out.println(oneLetter);
        }
    }
}
