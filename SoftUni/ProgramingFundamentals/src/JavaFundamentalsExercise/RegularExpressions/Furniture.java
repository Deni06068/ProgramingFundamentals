package JavaFundamentalsExercise.RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<FurnitureClass> furniture = new ArrayList<>();
        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[\\d]+|[\\d.\\d]+)\\!(?<quantity>\\d+)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                FurnitureClass furniture1 = new FurnitureClass(matcher.group("name"), Double.parseDouble(matcher.group("price")), Integer.parseInt(matcher.group("quantity")));
                furniture.add(furniture1);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(furnitureClass -> System.out.println(furnitureClass.name));
        double finalPrice = furniture.stream().mapToDouble(furnitureClass -> (furnitureClass.quantity * furnitureClass.price)).sum();
        System.out.printf("Total money spend: %.2f", finalPrice);
    }

    static class FurnitureClass {
        String name;
        double price;
        int quantity;

        public FurnitureClass(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
}
