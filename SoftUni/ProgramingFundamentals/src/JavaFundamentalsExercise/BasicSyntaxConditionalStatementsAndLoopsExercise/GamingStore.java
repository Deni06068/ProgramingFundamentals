package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double restMoney = money;
        String game = scanner.nextLine();

        while (!game.equals("Game Time")){
            if (money > 0) {
                switch (game) {
                    case "OutFall 4":
                        money = money - 39.99;
                        if (money >= 0){
                            System.out.println("Bought OutFall 4");
                            game = scanner.nextLine();
                        }else {
                            System.out.println("Too Expensive");
                            money = money + 39.99;
                            game = scanner.nextLine();
                        }
                        break;
                    case "CS: OG":
                        money = money - 15.99;
                        if (money >= 0){
                            System.out.println("Bought CS: OG");
                            game = scanner.nextLine();
                        }else {
                            System.out.println("Too Expensive");
                            money = money + 15.99;
                            game = scanner.nextLine();
                        }
                        break;
                    case "Zplinter Zell":
                        money = money - 19.99;
                        if (money >= 0){
                            System.out.println("Bought Zplinter Zell");
                            game = scanner.nextLine();
                        }else {
                            System.out.println("Too Expensive");
                            money = money + 19.99;
                            game = scanner.nextLine();
                        }
                        break;
                    case "Honored 2":
                        money = money - 59.99;
                        if (money >= 0){
                            System.out.println("Bought Honored 2");
                            game = scanner.nextLine();
                        }else {
                            System.out.println("Too Expensive");
                            money = money + 59.99;
                            game = scanner.nextLine();
                        }
                        break;
                    case "RoverWatch":
                        money = money - 29.99;
                        if (money >= 0){
                            System.out.println("Bought RoverWatch");
                            game = scanner.nextLine();
                        }else {
                            System.out.println("Too Expensive");
                            money = money + 29.99;
                            game = scanner.nextLine();
                        }
                        break;
                    case "RoverWatch Origins Edition":
                        money = money - 39.99;
                        if (money >= 0){
                            System.out.println("Bought RoverWatch Origins Edition");
                            game = scanner.nextLine();
                        }else {
                            System.out.println("Too Expensive");
                            money = money + 39.99;
                            game = scanner.nextLine();
                        }
                        break;
                    default:
                        System.out.println("Not Found");
                        game = scanner.nextLine();
                        break;
                }
            }else {
                System.out.println("Out of money!");
                break;
            }
        }
        if (money == 0){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", restMoney - money, money);
        }
    }
}
