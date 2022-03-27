package Exercise.ForLoop;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groups; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + numberOfPeople;
            if (numberOfPeople <= 5) {
                musala = musala + numberOfPeople;
            } else if (numberOfPeople <= 12) {
                monblan = monblan + numberOfPeople;
            } else if (numberOfPeople <= 25) {
                kilimandjaro = kilimandjaro + numberOfPeople;
            } else if (numberOfPeople <= 40) {
                k2 = k2 + numberOfPeople;
            } else {
                everest = everest + numberOfPeople;
            }
        }
        double musalaPercent = musala * 1.0 / allPeople * 100;
        double monblanPercent = monblan * 1.0 / allPeople * 100;
        double kilimanjaroPercent = kilimandjaro * 1.0 / allPeople * 100;
        double k2Percent = k2 * 1.0 / allPeople * 100;
        double everestPercent = everest * 1.0 / allPeople * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", musalaPercent, monblanPercent, kilimanjaroPercent, k2Percent, everestPercent);
    }
}
