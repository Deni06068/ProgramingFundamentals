package Lab.ForLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
         for (int i = 1; i <= countNumbers; i ++){
             int number = Integer.parseInt(scanner.nextLine());
             sum = sum + number;
         }
         System.out.println(sum);
    }
}
