package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int ziumbiuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliiPrice = magnolii * 3.25;
        double ziumbiuliPrice = ziumbiuli * 4;
        double roziPrice = rozi * 3.50;
        double kaktusiPrice = kaktusi * 8;
        double profit = magnoliiPrice + ziumbiuliPrice + roziPrice + kaktusiPrice;
        double profitWithoutTax = profit - (profit * 0.05);
        double diff = Math.abs(profitWithoutTax - giftPrice);

        if (profitWithoutTax >= giftPrice){
            diff = Math.floor(diff);
            System.out.printf("She is left with %.0f leva.", diff);
        }else {
            diff = Math.ceil(diff);
            System.out.printf("She will have to borrow %.0f leva.", diff);
        }
    }
}
