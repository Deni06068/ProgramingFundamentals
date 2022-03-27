package JavaFundamentalsExercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxRepeat = 0;
        int numRepeat = 0;
        for (int i = 0; i < numbers.length; i++) {
            int repeat = 0;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    repeat++;
                }else {
                    break;
                }
            }
            if (maxRepeat < repeat){
                maxRepeat = repeat;
                numRepeat = numbers[i];
            }
        }
        for (int i = 0; i < maxRepeat; i++) {
            System.out.print(numRepeat + " ");
        }
    }
}
