package Exercise.NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = firstNum; i <= secondNum; i++){
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNum.length(); j++){
                int currentNumber = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0){
                    evenSum = evenSum + currentNumber;
                }else {
                    oddSum = oddSum + currentNumber;
                }
            }
            if (oddSum == evenSum){
                System.out.print(i + " ");
            }
        }
    }
}
