package JavaFundamentalsLab.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int numToWrite = Math.abs(num);

        while (numToWrite % 2 == 1){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
            numToWrite = Math.abs(num);
        }
        System.out.println("The number is: " + numToWrite);
    }
}
