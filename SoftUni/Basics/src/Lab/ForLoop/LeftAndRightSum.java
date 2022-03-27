package Lab.ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumNum = 0;
        int sumNum2 = 0;

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());
            sumNum = sumNum + num;
        }
        for (int i = 0; i < n; i++){
            int num2 = Integer.parseInt(scanner.nextLine());
            sumNum2 = sumNum2 + num2;
        }
        if (sumNum == sumNum2){
            System.out.printf("Yes, sum = %d", sumNum);
        }else {
            int diff = Math.abs(sumNum - sumNum2);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
