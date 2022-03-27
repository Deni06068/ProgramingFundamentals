package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine()); //кв.м. ЛОЗЕ
        double y = Double.parseDouble(scanner.nextLine()); //грозде за 1 кв.м.
        int z = Integer.parseInt(scanner.nextLine()); //нужни литри вино
        int workers = Integer.parseInt(scanner.nextLine()); //брой работници
        double areaForWine = x * 0.40;
        double litresWine = (y * areaForWine) / 2.5;
        double diff = Math.abs(z - litresWine);

        if (litresWine < z){
            diff = Math.floor(diff);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);
        }else{
            litresWine = Math.floor(litresWine);
            double litresPerWorker = Math.ceil(diff / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", litresWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", diff, litresPerWorker);
        }
    }
}
