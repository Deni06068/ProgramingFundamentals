package Exercise.ForLoop;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double water = 0;
        double internet = 0;
        double other = 0;

        for (int i = 1; i <= months; i++){
            double electricityOneMonth = Double.parseDouble(scanner.nextLine());
            electricity = electricity + electricityOneMonth;
            water += 20;
            internet += 15;
            other = ((electricityOneMonth + 20 + 15) * 0.2) + (electricityOneMonth + 20 + 15) + other;
        }
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv%n", (electricity + water + internet + other) / months);
    }
}
