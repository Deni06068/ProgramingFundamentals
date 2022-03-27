package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPricePerOne = Double.parseDouble(scanner.nextLine());
        double robePricePerOne = Double.parseDouble(scanner.nextLine());
        double beltPricePerOne = Double.parseDouble(scanner.nextLine());

        double allLightsabersPrice = (Math.ceil(students * 1.1)) * lightsaberPricePerOne;
        double robesPrice = robePricePerOne * students;
        double beltsPrice = beltPricePerOne * (students - (students / 6));
        double finalPrice = allLightsabersPrice + robesPrice + beltsPrice;

        if (money >= finalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.%n", finalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", finalPrice - money);
        }
    }
}
