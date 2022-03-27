package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersOver = Integer.parseInt(scanner.nextLine());
        double hoursForWorking = (days * 8) - ((days * 8) * 0.10);
        int hoursOver = workersOver * (2 * days);
        double allWorkingHours = Math.floor(hoursForWorking + hoursOver);
        double hoursLeft = Math.abs(hours - allWorkingHours);
        if (hours <= allWorkingHours){
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        }else
            System.out.printf("Not enough time!%.0f hours needed.", hoursLeft);

    }
}
