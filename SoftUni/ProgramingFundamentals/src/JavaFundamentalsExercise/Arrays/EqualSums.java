package JavaFundamentalsExercise.Arrays;

import javax.management.MBeanRegistrationException;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum1 = 0;
        int sum2 = 0;
        boolean isTrue = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sum2 += numbers[j];
            }
            if (sum1 == sum2){
                if (numbers.length > 1) {
                    System.out.print(i);
                    isTrue = true;
                }else {
                    System.out.print("0");
                    isTrue = true;
                    break;
                }
                break;
            }else {
                sum1 += numbers[i];
                sum2 = 0;
            }
        }
        if (!isTrue){
            System.out.print("no");
        }
    }
}
