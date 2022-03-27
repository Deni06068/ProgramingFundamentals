package Exercise.ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargoCount = Integer.parseInt(scanner.nextLine());
        int tonsBus = 0;
        int tonsTruck = 0;
        int tonsTrain = 0;

        for (int i = 0; i < cargoCount; i++){
            int cargoWeight = Integer.parseInt(scanner.nextLine());
            if (cargoWeight <= 3){
                tonsBus = tonsBus + cargoWeight;
            }else if (cargoWeight <= 11){
                tonsTruck = tonsTruck + cargoWeight;
            }else {
                tonsTrain = tonsTrain + cargoWeight;
            }
        }
        int priceTonsBus = tonsBus * 200;
        int priceTonsTruck = tonsTruck * 175;
        int priceTonsTrain = tonsTrain * 120;
        double price = priceTonsBus + priceTonsTruck + priceTonsTrain;
        int totalTons = tonsBus + tonsTruck + tonsTrain;
        double pricePerTon = price / totalTons;
        double busPercent = tonsBus * 1.0 / totalTons * 100;
        double truckPercent = tonsTruck * 1.0 / totalTons * 100;
        double trainPercent = tonsTrain * 1.0 / totalTons * 100;

        System.out.printf("%.2f%n", pricePerTon);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
