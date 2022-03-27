package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        double money = 0.0;
        while (!start.equals("Start")) {
            double currentMoney = Double.parseDouble(start);
            if (currentMoney != 0.1 && currentMoney != 0.2 && currentMoney != 0.5 && currentMoney != 1 &&
                    currentMoney != 2) {
                System.out.printf("Cannot accept %.2f%n", currentMoney);
                start = scanner.nextLine();
                continue;
            } else {
                money += currentMoney;
            }
            start = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (money >= 2) {
                        money = money - 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (money >= 0.7) {
                        money = money - 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (money >= 1.5) {
                        money = money - 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (money >= 0.8) {
                        money = money - 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (money >= 1) {
                        money = money - 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}
