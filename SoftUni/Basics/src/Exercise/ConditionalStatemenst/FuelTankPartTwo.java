package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String discount = scanner.nextLine();

        double priceLitres = 0.0;

        if (discount.equals("Yes")){
            if (fuel.equals("Gasoline")){
                priceLitres = litres * 2.04;
                if (litres > 25){
                    priceLitres = priceLitres - (priceLitres * 0.10);
                }else if (litres >= 20){
                    priceLitres = priceLitres - (priceLitres * 0.08);
                }
            }else if (fuel.equals("Diesel")){
                priceLitres = litres * 2.21;
                if (litres > 25){
                    priceLitres = priceLitres - (priceLitres * 0.10);
                }else if (litres >= 20){
                    priceLitres = priceLitres - (priceLitres * 0.08);
                }
            }else if (fuel.equals("Gas")){
                priceLitres = litres * 0.85;
                if (litres > 25){
                    priceLitres = priceLitres - (priceLitres * 0.10);
                }else if (litres >= 20){
                    priceLitres = priceLitres - (priceLitres * 0.08);
                }
            }

            }else if (discount.equals("No")){
            if (fuel.equals("Gasoline")){
                priceLitres = litres * 2.22;
                if (litres > 25){
                    priceLitres = priceLitres - (priceLitres * 0.10);
                }else if (litres >= 20){
                    priceLitres = priceLitres - (priceLitres * 0.08);
                }
            }else if (fuel.equals("Diesel")){
                priceLitres = litres * 2.33;
                if (litres > 25){
                    priceLitres = priceLitres - (priceLitres * 0.10);
                }else if (litres >= 20){
                    priceLitres = priceLitres - (priceLitres * 0.08);
                }
            }else if (fuel.equals("Gas")){
                priceLitres = litres * 0.93;
                if (litres > 25){
                    priceLitres = priceLitres - (priceLitres * 0.10);
                }else if (litres >= 20){
                    priceLitres = priceLitres - (priceLitres * 0.08);
                }
            }
        }
        System.out.printf("%.2f lv.", priceLitres);

    }
}
