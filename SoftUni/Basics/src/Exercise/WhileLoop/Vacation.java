package Exercise.WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int daysSpend = 0;
        int allDays = 0;
        boolean fiveDays = false;

        while (tripPrice > money){
            String spendOrSave = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());

            switch (spendOrSave){
                case "spend":
                    money = money - cash;
                    if (money < 0){
                        money = 0;
                    }
                    daysSpend++;
                    allDays++;
                    break;
                case "save":
                    money = money + cash;
                    daysSpend = 0;
                    allDays++;
                    break;
            }
            if (daysSpend == 5){
                fiveDays = true;
             break;
            }
        }
        if (fiveDays){
            System.out.printf("You can't save the money.%n%d", allDays);
        }else {
            System.out.printf("You saved the money for %d days.", allDays);
        }
    }
}
