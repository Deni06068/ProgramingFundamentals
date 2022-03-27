package Lab.WhileLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        while (sum < number){
            num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
