package Exercise.Exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForBall = Double.parseDouble(scanner.nextLine());

        double shorts = shirtPrice * 0.75;
        double socks = shorts * 0.20;
        double shoes = (shirtPrice + shorts) * 2;
        double sumWithoutDiscount = shirtPrice + shorts + socks + shoes;

        double sumWithDiscount = sumWithoutDiscount * 0.85;

        if (sumWithDiscount >= sumForBall){
            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", sumWithDiscount);
        }else{
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.", sumForBall - sumWithDiscount);
        }
    }
}
