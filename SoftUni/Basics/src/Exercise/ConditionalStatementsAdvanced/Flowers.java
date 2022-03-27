package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double priceOneHrizantema = 0.0;
        double priceOneRose = 0.0;
        double priceOneTulip = 0.0;

        switch (season){
            case "Spring":
            case "Summer":
                priceOneHrizantema = 2;
                priceOneRose = 4.10;
                priceOneTulip = 2.50;
                break;
            case "Autumn":
            case "Winter":
                priceOneHrizantema = 3.75;
                priceOneRose = 4.50;
                priceOneTulip = 4.15;
                break;
        }
        double price = (priceOneHrizantema * hrizantemi) + (priceOneRose * roses) + (priceOneTulip * tulips);
        if (holiday.equals("Y")){
            price = price + (price * 0.15);
        }
        if (tulips > 7 && season.equals("Spring")){
            price = price - (price * 0.05);
        }
        if (roses >= 10 && season.equals("Winter")){
            price = price - (price * 0.1);
        }
        if ((hrizantemi + roses + tulips) > 20){
            price = price - (price * 0.2);
        }
        System.out.printf("%.2f", (price + 2));
    }
}
