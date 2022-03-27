package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumriq = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        double midiKg = Double.parseDouble(scanner.nextLine());
        double pricePalamud = skumriq + (skumriq * 0.6);
        double priceSafrid = caca + (caca * 0.8);
        double allPricePalamud = palamudKg * pricePalamud;
        double allPriceSafrid = safridKg * priceSafrid;
        double allPriceMidi = midiKg * 7.5;
        double finalPrice = allPricePalamud + allPriceSafrid + allPriceMidi;
        System.out.printf("%.2f", finalPrice);

    }
}
