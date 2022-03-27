package Exercise.ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerOneToy = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int money = 0;
        int allMoney = 0;

        for (int i = 1; i <= age; i++){
            if (i % 2 != 0){
                toys = toys + 1;
            }else {
                money = money + 10;
                allMoney = allMoney + money - 1;
            }
        }

        int toysMoney = toys * pricePerOneToy;
        double allSavedMoney = toysMoney + allMoney;
        double diff = Math.abs(allSavedMoney - washingMachine);
        if (washingMachine <= allSavedMoney){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
