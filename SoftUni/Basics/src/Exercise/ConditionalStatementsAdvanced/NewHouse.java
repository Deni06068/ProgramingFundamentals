package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (typeFlower){
            case "Roses":
                price = countFlowers * 5;
                if (countFlowers > 80){
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers > 90){
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = countFlowers * 2.80;
                if (countFlowers > 80){
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = countFlowers * 3;
                if (countFlowers < 120){
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = countFlowers * 2.50;
                if (countFlowers < 80){
                    price = price + (price * 0.20);
                }
                break;
        }
        double diff = Math.abs(price - budget);
        if (price <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlower, diff);

        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
