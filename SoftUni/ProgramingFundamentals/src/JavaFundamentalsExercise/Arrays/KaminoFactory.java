package JavaFundamentalsExercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int maxCounter = 0;
        int bestSample = 0;
        int[] bestSamplePattern = new int[1];
        int maxSumOfOne = 0;
        int maxCounterOfOne = 0;

        for (int j = 1; j <= length; j++) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }
            int counterForOne = 0;
            int[] DNA = Arrays.stream(input.split("\\!+")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < DNA.length; i++) {
                int counter = 0;
                if (DNA[i] == 1){
                    counterForOne++;
                }
                if (maxCounterOfOne < counterForOne){
                    maxCounterOfOne = counterForOne;
                }
                for (int k = 0; k < DNA.length; k++) {
                    if (DNA[i] == 1 && DNA[i] == DNA[k]){
                        counter++;
                    }
                    if (maxCounter <= counter) {
                        maxCounter = counter;
                        bestSample = j;
                        bestSamplePattern = DNA;
                    }
                }
            }
            counterForOne = 0;
        }
        for (int i = 0; i < bestSamplePattern.length; i++) {
            System.out.print(bestSamplePattern[i]);

        }

    }
}
