package Lab.ForLoop;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < word.length(); i++){
            char symbol = word.charAt(i);
            switch (symbol) {
                case 'a':
                    result = result + 1;
                    break;
                case 'e':
                    result = result + 2;
                    break;
                case 'i':
                    result = result + 3;
                    break;
                case 'o':
                    result = result + 4;
                    break;
                case 'u':
                    result = result + 5;
                    break;
            }
        }
        System.out.println(result);
    }
}
