package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0.0;

        for (int i = 1; i <= orders; i++) {
            double priceOfCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double pricePerOrder = (days * capsules) * priceOfCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrder);
            finalPrice += pricePerOrder;
        }
        System.out.printf("Total: $%.2f", finalPrice);
    }
}
