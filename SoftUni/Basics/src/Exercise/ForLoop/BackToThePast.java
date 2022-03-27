package Exercise.ForLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        double moneyLeft = money;
        int  years = 19;
        for (int i = 1800; i <= yearToLive; i++){
            if (i % 2 == 0){
                moneyLeft = moneyLeft - 12000;

            }else {
                moneyLeft = moneyLeft - (12000 + (years*50));
                years = years + 2;
            }
        }

        if (money >= moneyLeft && moneyLeft >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        }else {
            moneyLeft = Math.abs(moneyLeft);
            System.out.printf("He will need %.2f dollars to survive.", moneyLeft);
        }
    }
}
