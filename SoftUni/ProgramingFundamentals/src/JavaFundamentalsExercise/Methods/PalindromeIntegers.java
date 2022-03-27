package JavaFundamentalsExercise.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }
    }
    public static String isPalindrome (String input){
        int num[] = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= num.length / 2; i++) {
            if (num[i - 1] == num[num.length - i]){
            }else {
                return "false";
            }
        }
        return "true";
    }
}
