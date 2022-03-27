package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegieMenu = Integer.parseInt(scanner.nextLine());
        Double chickenMenuPrice = chickenMenu * 10.35;
        Double fishMenuPrice = fishMenu * 12.40;
        Double vegieMenuPrice = vegieMenu * 8.15;
        Double desertPrice = (chickenMenuPrice + fishMenuPrice + vegieMenuPrice) * 0.20;
        Double deliveryPrice = 2.50;
        Double finalPrice = chickenMenuPrice + fishMenuPrice + vegieMenuPrice + desertPrice + deliveryPrice;
        System.out.println(finalPrice);
    }
}
