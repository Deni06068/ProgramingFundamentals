package JavaFundamentalsExercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNum = Integer.MIN_VALUE;
        int index = 0;
        int biggestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isTrue = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    biggestNumber = numbers[i];
                    isTrue = true;
                }else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue){
                System.out.print(biggestNumber + " ");
            }
            if (i == numbers.length - 1 && biggestNumber >= 0){
                System.out.print(numbers[i]);
            }
        }
    }
}