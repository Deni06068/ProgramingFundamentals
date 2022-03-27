package JavaFundamentalsLab.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int firstNum = 1;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println(firstNum);
            sum += firstNum;
            firstNum += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
