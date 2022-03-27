package Exercise.ForLoop;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int lastValue = 0;
        int biggestDifference = 0;

        for (int i = 1; i <= count; i++){
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            int sum = num1 + num2;
            if (sum < minValue){
                minValue = sum;
            }
            if (sum > maxValue){
                maxValue = sum;
            }if (i == 1){
                lastValue = sum;
                continue;
            }
            if (biggestDifference < Math.abs(lastValue - sum)){
                biggestDifference = Math.abs(lastValue - sum);
            }
            lastValue = sum;
        }
        if (minValue == maxValue){
            System.out.printf("Yes, value=%d", minValue);
        }else {
            System.out.printf("No, maxdiff=%d", biggestDifference);
        }
    }
}
