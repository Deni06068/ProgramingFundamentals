package JavaFundamentalsExercise.Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = Integer.parseInt(scanner.nextLine());
        long num2 = Integer.parseInt(scanner.nextLine());
        double factorialNum1 = factorialNum(num1);
        double factorialNum2 = factorialNum(num2);

        System.out.printf("%.2f", factorialNum1 / factorialNum2);

    }
    public static long factorialNum(long num){
        long sum = 1;
        for (int i = 0; i < num; i++) {
            sum = sum * (i + 1);
        }
        return sum;
    }
}
