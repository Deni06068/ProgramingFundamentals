package Lab.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        if (city.equals("Sofia")){
            switch (product){
                case "coffee":
                    price = count * 0.50;
                    break;
                case "water":
                    price = count * 0.80;
                    break;
                case "beer":
                    price = count * 1.20;
                    break;
                case "sweets":
                    price = count * 1.45;
                    break;
                case "peanuts":
                    price = count * 1.60;
            }
        }else if (city.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    price = count * 0.40;
                    break;
                case "water":
                    price = count * 0.70;
                    break;
                case "beer":
                    price = count * 1.15;
                    break;
                case "sweets":
                    price = count * 1.30;
                    break;
                case "peanuts":
                    price = count * 1.50;
            }

        }else if(city.equals("Varna")){
            switch (product){
                case "coffee":
                    price = count * 0.45;
                    break;
                case "water":
                    price = count * 0.70;
                    break;
                case "beer":
                    price = count * 1.10;
                    break;
                case "sweets":
                    price = count * 1.35;
                    break;
                case "peanuts":
                    price = count * 1.55;
            }
        }
        System.out.println(price);
    }
}
