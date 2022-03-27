package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double profit = 0.0;

        if (projection.equals("Premiere")){
            profit = rows * columns * 12;
        }else if (projection.equals("Normal")){
            profit = rows * columns * 7.5;
        }else if (projection.equals("Discount")){
            profit = rows * columns * 5;
        }
        System.out.printf("%.2f leva", profit);
    }
}
