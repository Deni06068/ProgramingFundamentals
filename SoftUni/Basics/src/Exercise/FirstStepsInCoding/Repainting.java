package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hoursPerJob = Integer.parseInt(scanner.nextLine());
        Double priceForNylon = (nylon + 2) * 1.50;
        Double priceForPaint = (paint + (paint * 10 / 100.0)) * 14.50;
        Double priceForThinner = thinner * 5.0;
        Double bags = 0.40;
        Double priceForAll = priceForNylon + priceForPaint + priceForThinner + bags;
        Double paymentForJob = (priceForAll * 30 / 100) * hoursPerJob;
        Double finalPrice = priceForAll + paymentForJob;
        System.out.println(finalPrice);

    }
}
