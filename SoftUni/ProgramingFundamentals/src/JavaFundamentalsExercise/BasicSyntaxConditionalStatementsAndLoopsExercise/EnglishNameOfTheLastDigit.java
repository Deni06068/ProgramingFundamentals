package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String nameOfNum = "";
        int lastNum = num % 10;
        switch (lastNum){
            case 1:
                nameOfNum = "one";
                break;
            case 2:
                nameOfNum = "two";
                break;
            case 3:
                nameOfNum = "three";
                break;
            case 4:
                nameOfNum = "four";
                break;
            case 5:
                nameOfNum = "five";
                break;
            case 6:
                nameOfNum = "six";
                break;
            case 7:
                nameOfNum = "seven";
                break;
            case 8:
                nameOfNum = "eight";
                break;
            case 9:
                nameOfNum = "nine";
                break;
            case 0:
                nameOfNum = "zero";
                break;
        }
        System.out.println(nameOfNum);
    }
}
