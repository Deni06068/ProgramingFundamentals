package Exercise.ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double maxNum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (num > maxNum){
                maxNum = num;
            }
        }

        if (maxNum == (sum * 1.0 / 2)){
            System.out.printf("Yes%nSum = %.0f", maxNum);
        }else{
            double diff = Math.abs((sum - maxNum) - maxNum);
            System.out.printf("No%nDiff = %.0f", diff);
        }
    }
}
