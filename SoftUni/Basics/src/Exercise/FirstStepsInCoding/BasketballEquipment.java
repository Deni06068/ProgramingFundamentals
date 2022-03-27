package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());
        double trainers = yearTax - (yearTax * 0.40);
        double suit = trainers - (trainers * 0.20);
        double ball = suit * 0.25;
        double acc = ball * 0.20;
        double finalPrice = yearTax + trainers + suit + ball + acc;
        System.out.println(finalPrice);

    }
}
