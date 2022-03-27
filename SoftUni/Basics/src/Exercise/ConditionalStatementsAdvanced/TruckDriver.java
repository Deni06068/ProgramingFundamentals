package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double rangePerMonth = Double.parseDouble(scanner.nextLine());
        double pricePerKilometer = 0.0;

        if (rangePerMonth <= 5000){
            switch (season){
                case "Spring":
                case "Autumn":
                    pricePerKilometer = 0.75;
                    break;
                case "Summer":
                    pricePerKilometer = 0.90;
                    break;
                case "Winter":
                    pricePerKilometer = 1.05;
                    break;
            }
        }else if (rangePerMonth <= 10000){
            switch (season){
                case "Spring":
                case "Autumn":
                    pricePerKilometer = 0.95;
                    break;
                case "Summer":
                    pricePerKilometer = 1.10;
                    break;
                case "Winter":
                    pricePerKilometer = 1.25;
                    break;
            }
        }else if (rangePerMonth <= 20000){
            pricePerKilometer = 1.45;
        }
        double profit = rangePerMonth * 4 * pricePerKilometer;
        double profitWithoutTax = profit * 0.90;
        System.out.printf("%.2f", profitWithoutTax);
    }
}
