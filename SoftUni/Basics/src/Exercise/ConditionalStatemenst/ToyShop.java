package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double trip = Double.parseDouble(scanner.nextLine());
            int puzzles = Integer.parseInt(scanner.nextLine());
            int dolls = Integer.parseInt(scanner.nextLine());
            int bears = Integer.parseInt(scanner.nextLine());
            int minions = Integer.parseInt(scanner.nextLine());
            int trucks = Integer.parseInt(scanner.nextLine());

        int allToys = puzzles + dolls + bears + minions + trucks;

            double puzzlesPrice = puzzles * 2.60;
            double dollsPrice = dolls * 3;
            double bearsPrice = bears * 4.10;
            double minionsPrice = minions * 8.20;
            double trucksPrice = trucks * 2;

        double finalPrice = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        if (allToys >= 50) {
            finalPrice = finalPrice - (finalPrice * 0.25);
        }
        double profit = finalPrice - (finalPrice * 0.10);
        double diff = Math.abs(profit - trip);

        if (trip <= profit){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else
            System.out.printf("Not enough money! %.2f lv needed.", diff);

    }
}
