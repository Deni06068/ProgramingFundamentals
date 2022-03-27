package Exercise.ExamTraining;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int numSets = Integer.parseInt(scanner.nextLine());
        double priceWithoutDiscount = 0.0;
        double finalPrice = 0.0;

        if (fruit.equals("Watermelon")){
            switch (set){
                case "small":
                    priceWithoutDiscount = numSets * 2 * 56;
                    break;
                case "big":
                    priceWithoutDiscount = numSets * 5 * 28.70;
                    break;
            }
        }else if (fruit.equals("Mango")){
            switch (set){
                case "small":
                    priceWithoutDiscount = numSets * 2 * 36.66;
                    break;
                case "big":
                    priceWithoutDiscount = numSets * 5 * 19.60;
                    break;
            }
        }else if (fruit.equals("Pineapple")) {
            switch (set) {
                case "small":
                    priceWithoutDiscount = numSets * 2 * 42.10;
                    break;
                case "big":
                    priceWithoutDiscount = numSets * 5 * 24.80;
                    break;
            }
        }else if (fruit.equals("Raspberry")){
            switch (set) {
                case "small":
                    priceWithoutDiscount = numSets * 2 * 20;
                    break;
                case "big":
                    priceWithoutDiscount = numSets * 5 * 15.20;
                    break;
            }
        }
        if (400 <= priceWithoutDiscount && priceWithoutDiscount <= 1000){
            finalPrice = priceWithoutDiscount - (priceWithoutDiscount * 0.15);
        }else if(priceWithoutDiscount > 1000){
            finalPrice = priceWithoutDiscount - (priceWithoutDiscount * 0.5);
        }else{
            finalPrice = priceWithoutDiscount;
        }
        System.out.printf("%.2f lv.", finalPrice);
    }
}
