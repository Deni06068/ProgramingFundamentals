package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        Double percent = Double.parseDouble(scanner.nextLine());
        Double interest = deposit * percent / 100;
        Double interestPerMonth = interest / 12;
        Double amaunt = deposit + months * interestPerMonth;
        System.out.println(amaunt);
    }
}
