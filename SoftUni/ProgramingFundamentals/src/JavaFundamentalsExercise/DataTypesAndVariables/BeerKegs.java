package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        double maxCapacityKeg = 0;
        String maxCapacityKegModel = "";

        for (int i = 0; i < lines; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double capacity = Math.PI * Math.pow(radius, 2) * height;
            if (maxCapacityKeg < capacity){
                maxCapacityKeg = capacity;
                maxCapacityKegModel = modelKeg;
            }
        }
        System.out.println(maxCapacityKegModel);
    }
}
