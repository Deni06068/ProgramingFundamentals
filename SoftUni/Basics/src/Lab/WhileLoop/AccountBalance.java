package Lab.WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sum = scanner.nextLine();
        double allSavings = 0.0;

        while (!sum.equals("NoMoreMoney")){
            double money = Double.parseDouble(sum);
            if (money < 0 ){
                System.out.println("Invalid operation!");
                break;
            }else {
                System.out.printf("Increase: %.2f%n", money);
                allSavings += money;
                sum = scanner.nextLine();
            }
        }
        System.out.printf("Total: %.2f", allSavings);
    }
}
