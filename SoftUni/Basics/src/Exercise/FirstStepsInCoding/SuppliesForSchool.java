package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        Double priceAllPens = pens * 5.80;
        Double priceAllMarkers = markers * 7.20;
        Double priceAllDetergent = detergent * 1.20;
        Double priceAll = priceAllPens + priceAllMarkers + priceAllDetergent;
        Double finalPrice = priceAll - (priceAll * discount / 100);

        System.out.println(finalPrice);

    }
}
