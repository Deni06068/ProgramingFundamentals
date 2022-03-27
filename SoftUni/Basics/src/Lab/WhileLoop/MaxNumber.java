package Lab.WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!number.equals("Stop")){
            int num = Integer.parseInt(number);
            if (num > maxNumber){
                maxNumber = num;
            }
            number = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
