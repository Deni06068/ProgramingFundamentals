package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String ticket = scanner.nextLine(); // •	IP – 499.99 лева.   •	Normal – 249.99 лева.
        int people = Integer.parseInt(scanner.nextLine());
        double budgetMinusTransport = 0.0;

        if (people <= 4){
            budgetMinusTransport = budget - (budget * 0.75);
        }else if (people <= 9){
            budgetMinusTransport = budget - (budget * 0.60);
        }else if (people <= 24){
            budgetMinusTransport = budget - (budget * 0.50);
        }else if (people <= 49){
            budgetMinusTransport = budget - (budget * 0.40);
        }else {
            budgetMinusTransport = budget - (budget * 0.25);
        }
        switch (ticket){
            case "VIP":
                double diff = Math.abs(budgetMinusTransport - (people * 499.99));
                if ((budgetMinusTransport - (people * 499.99)) >= 0){
                    System.out.printf("Yes! You have %.2f leva left.", diff);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff);
                }
                break;
            case "Normal":
                double diff1 = Math.abs(budgetMinusTransport - (people * 249.99));
                if ((budgetMinusTransport - (people * 249.99) >= 0)){
                    System.out.printf("Yes! You have %.2f leva left.", diff1);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.", diff1);
                }
                break;
        }
    }
}
