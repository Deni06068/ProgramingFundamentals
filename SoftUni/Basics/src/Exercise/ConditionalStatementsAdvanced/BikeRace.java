package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double taxJuniors = 0.0;
        double taxSeniors = 0.0;

        switch (trace){
            case "trail":
                taxJuniors = 5.50;
                taxSeniors = 7;
                break;
            case "cross-country":
                taxJuniors = 8;
                taxSeniors = 9.50;
                break;
            case "downhill":
                taxJuniors = 12.25;
                taxSeniors = 13.75;
                break;
            case "road":
                taxJuniors = 20;
                taxSeniors = 21.50;
                break;
        }
        double profit = (juniors * taxJuniors) + (seniors * taxSeniors);
        if(trace.equals("cross-country") && (juniors + seniors) >= 50){
            profit = profit - (profit * 0.25);
        }
        double finalProfit = profit - (profit * 0.05);
        System.out.printf("%.2f", finalProfit);
    }
}
