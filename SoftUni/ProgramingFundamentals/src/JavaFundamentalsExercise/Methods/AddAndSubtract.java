package JavaFundamentalsExercise.Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(sumNum1Num2(num1, num2), num3));

    }

    public static int sumNum1Num2 (int num1, int num2){
        return num1 + num2;
    }
    public static int subtract (int sumNum1Num2, int num3){
        return sumNum1Num2 - num3;
    }
}
