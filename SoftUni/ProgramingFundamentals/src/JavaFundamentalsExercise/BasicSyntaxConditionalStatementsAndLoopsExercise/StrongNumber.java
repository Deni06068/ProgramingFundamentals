package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int number = Integer.parseInt(num);
        int numberForTest = number;
        int currenNum = 0;
        int sumOfFactorials = 0;

        for (int i = 0; i < num.length(); i++) {
            currenNum = numberForTest % 10;
            int factorial = 1;
            for (int j = 1; j <= currenNum; j++) {
                factorial = j * factorial;
            }
            sumOfFactorials += factorial;
            numberForTest = numberForTest / 10;
        }
        if (number == sumOfFactorials){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
