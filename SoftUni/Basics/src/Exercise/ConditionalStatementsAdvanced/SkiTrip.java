package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        double pricePerNight = 0;
        double priceWithoutDiscount = 0.0;
        double finalPrice = 0.0;

        switch (room) {
            case "room for one person":
                pricePerNight = 18;
                finalPrice = pricePerNight * (days - 1);
                break;
            case "apartment":
                pricePerNight = 25;
                if (days < 10) {
                    finalPrice = pricePerNight * (days - 1) * 0.70;
                } else if (days <= 15) {
                    finalPrice = pricePerNight * (days - 1) * 0.65;
                } else
                    finalPrice = pricePerNight * (days - 1) * 0.5;
                break;
            case "president apartment":
                pricePerNight = 35;
                if (days < 10) {
                    finalPrice = pricePerNight * (days - 1) * 0.90;
                } else if (days <= 15) {
                    finalPrice = pricePerNight * (days - 1) * 0.85;
                } else
                    finalPrice = pricePerNight * (days - 1) * 0.8;
                break;
        }

        if (rating.equals("positive")){
            finalPrice = finalPrice + (finalPrice * 0.25);
            System.out.printf("%.2f", finalPrice);
        }else if(rating.equals("negative")){
            finalPrice = finalPrice - (finalPrice * 0.1);
            System.out.printf("%.2f", finalPrice);
        }
    }
}
