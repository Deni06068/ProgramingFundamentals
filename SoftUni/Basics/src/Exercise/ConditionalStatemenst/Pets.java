package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayGrams = Double.parseDouble(scanner.nextLine());

        double allFoodPerDay = dogFoodPerDay + catFoodPerDay + (turtleFoodPerDayGrams / 1000);
        double allFoodNeeded = allFoodPerDay * days;
        double diff = Math.abs(kgFood - allFoodNeeded);

        if ( kgFood >= allFoodNeeded){
            diff = Math.floor(diff);
            System.out.printf("%.0f kilos of food left.", diff);
        }else{
            diff = Math.ceil(diff);
            System.out.printf("%.0f more kilos of food are needed.", diff);
        }
    }
}
