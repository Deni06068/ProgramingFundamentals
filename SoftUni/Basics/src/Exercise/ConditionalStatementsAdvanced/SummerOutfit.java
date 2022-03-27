package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String clothes = "";
        String shoes = "";

        if (10 <= temperature && temperature <= 18){
            switch (timeOfDay){
                case "Morning":
                    clothes = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    clothes = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Evening":
                    clothes = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }else if ( 18 < temperature && temperature <= 24){
            switch (timeOfDay){
                case "Morning":
                    clothes = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    clothes = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    clothes = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }else if (temperature >= 25){
            switch (timeOfDay){
                case "Morning":
                    clothes = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    clothes = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    clothes = "Shirt";
                    shoes = "Moccasins";
                    break;
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, clothes, shoes);
    }
}
