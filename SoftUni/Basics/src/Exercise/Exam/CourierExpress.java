package Exercise.Exam;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (service) {
            case "standard":
                if (weight <1){
                    price = distance * 3;
                }else if (weight < 10){
                    price = distance * 5;
                }else if (weight < 40){
                    price = distance * 10;
                }else if (weight <90){
                    price = distance * 15;
                }else if (weight < 150){
                    price = distance * 20;
                }
                break;
            case "express":
                if (weight <1){
                    double priceOverPerKm = 0.8 * 3;
                    double priceOverWeight = weight * priceOverPerKm;
                    double priceOverAll = distance * priceOverWeight;
                    price = distance * 3 + priceOverAll;
                }else if (weight < 10){
                    double priceOverPerKm = 0.4 * 5;
                    double priceOverWeight = weight * priceOverPerKm;
                    double priceOverAll = distance * priceOverWeight;
                    price = distance * 5 + priceOverAll;
                }else if (weight < 40){
                    double priceOverPerKm = 0.05 * 10;
                    double priceOverWeight = weight * priceOverPerKm;
                    double priceOverAll = distance * priceOverWeight;
                    price = distance * 10 + priceOverAll;
                }else if (weight <90){
                    double priceOverPerKm = 0.02 * 15;
                    double priceOverWeight = weight * priceOverPerKm;
                    double priceOverAll = distance * priceOverWeight;
                    price = distance * 15 + priceOverAll;
                }else if (weight < 150){
                    double priceOverPerKm = 0.01 * 20;
                    double priceOverWeight = weight * priceOverPerKm;
                    double priceOverAll = distance * priceOverWeight;
                    price = distance * 20 + priceOverAll;
                }
                break;
        }
        double priceInLv = price / 100;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, priceInLv);
    }
}
