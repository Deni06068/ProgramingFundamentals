package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String evenOdd = "";

        switch (operator){
            case "+":
                result = N1 + N2;
                if(result % 2 == 0){
                    evenOdd = "even";
                }else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",N1, operator, N2, result, evenOdd);
                break;
            case "-":
                result = N1 - N2;
                if(result % 2 == 0){
                    evenOdd = "even";
                }else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",N1, operator, N2, result, evenOdd);
                break;
            case "*":
                result = N1 * N2;

                if(result % 2 == 0){
                    evenOdd = "even";
                }else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",N1, operator, N2, result, evenOdd);
                break;
            case "/":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {
                    result = (float)N1 / N2;
                    System.out.printf("%d %s %d = %.2f",N1, operator, N2, result);
                }
                break;
            case "%":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else{
                    result = N1 % N2;
                    System.out.printf("%d %s %d = %.0f", N1, operator, N2, result);
                }
                break;
        }
    }
}
