package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double pricePerSuit = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double priceForAllSuits = people * pricePerSuit;
        if (people > 150){
            priceForAllSuits = priceForAllSuits - (priceForAllSuits * 0.1);
        }
        double allCosts = decorPrice + priceForAllSuits;

        double diff = Math.abs(budget - allCosts);

        if (budget >= allCosts){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }else{
            System.out.println("Not enough money!");
        System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
