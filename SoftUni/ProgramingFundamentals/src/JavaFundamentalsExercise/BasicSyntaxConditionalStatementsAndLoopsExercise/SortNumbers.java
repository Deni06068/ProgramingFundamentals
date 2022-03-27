package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int largestNum = 0;
        int middleNum = 0;
        int smallestNum = 0;

        if (firstNum > secondNum && firstNum > thirdNum){
            largestNum = firstNum;
            if (secondNum > thirdNum){
                middleNum = secondNum;
                smallestNum = thirdNum;
            }else {
                middleNum = thirdNum;
                smallestNum = secondNum;
            }
        }else if (secondNum > firstNum && secondNum > thirdNum){
            largestNum = secondNum;
            if (firstNum > thirdNum){
                middleNum = firstNum;
                smallestNum = thirdNum;
            }else {
                middleNum = thirdNum;
                smallestNum = firstNum;
            }
        }else {
            largestNum = thirdNum;
            if (firstNum > secondNum){
                middleNum = firstNum;
                smallestNum = secondNum;
            }else {
                middleNum = secondNum;
                smallestNum = firstNum;
            }
        }
        System.out.println(largestNum);
        System.out.println(middleNum);
        System.out.println(smallestNum);
    }
}
