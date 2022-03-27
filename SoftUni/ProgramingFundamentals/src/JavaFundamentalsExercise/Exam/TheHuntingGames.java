package JavaFundamentalsExercise.Exam;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());
        int daysCount = 0;
        double totalWater = waterPerDay * players * days;
        double totalFood = foodPerDay * players * days;

        while (days != 0 || energy <= 0){
            daysCount++;
            double energyPerDay = Double.parseDouble(scanner.nextLine());
            energy = energy - energyPerDay;
            if (energy <= 0){
                break;
            }
            if (daysCount % 2 == 0){
                energy = (energy * 0.05) + energy;
                totalWater = totalWater - (totalWater * 0.30);
            }
            if (daysCount % 3 == 0){
                totalFood = totalFood - (totalFood / players);
                energy = (energy * 0.10) + energy;
            }
            days--;
        }
        if (energy > 0 && days == 0){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
