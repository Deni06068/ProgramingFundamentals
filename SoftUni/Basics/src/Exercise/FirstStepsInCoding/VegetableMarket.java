package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lvForKgVeg = Double.parseDouble(scanner.nextLine());
        double lvForKgFruits = Double.parseDouble(scanner.nextLine());
        int kgVeg = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());
        double priceVeg = lvForKgVeg * kgVeg;
        double priceFruits = lvForKgFruits * kgFruits;
        double finalPriceLV = priceVeg + priceFruits;
        double finalPriceEU = finalPriceLV / 1.94;
        System.out.printf("%.2f", finalPriceEU);


    }
}
