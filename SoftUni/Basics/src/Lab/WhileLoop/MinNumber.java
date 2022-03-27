package Lab.WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!number.equals("Stop")){
            int num = Integer.parseInt(number);
            if (num < minNumber){
                minNumber = num;
            }
            number = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
