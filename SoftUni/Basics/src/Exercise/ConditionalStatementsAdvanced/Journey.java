package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        String typeOfJourney = "";
        double cost = 0.0;
        if (budget <= 100){
            place = "Bulgaria";
            switch (season){
                case "summer":
                    cost = budget * 0.30;
                    typeOfJourney = "Camp";
                    break;
                case "winter":
                    cost = budget * 0.70;
                    typeOfJourney = "Hotel";
                    break;
            }
        }else if (budget <= 1000){
            place = "Balkans";
            switch (season){
                case "summer":
                    cost = budget * 0.40;
                    typeOfJourney = "Camp";
                    break;
                case "winter":
                    cost = budget * 0.80;
                    typeOfJourney = "Hotel";
                    break;
            }
        }else {
            place = "Europe";
            typeOfJourney = "Hotel";
            cost = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", place, typeOfJourney, cost);
    }
}
