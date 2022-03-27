package Exercise.ExamTraining;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chinaMoney = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsToLeva = bitcoins * 1168;
        double chinaMoneyToDolars = chinaMoney * 0.15;
        double dolarToLeva = chinaMoneyToDolars * 1.76;
        double levaAll = bitcoinsToLeva + dolarToLeva;
        double levaToEuro = levaAll / 1.95;
        double commissionPrice = levaToEuro * (commission /100);
        double finalSum = levaToEuro - commissionPrice;
        System.out.printf("%.2f", finalSum);

    }
}
