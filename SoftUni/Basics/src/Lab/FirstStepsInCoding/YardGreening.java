package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double price = area * 7.61;
        double discount = price * 0.18;
        double priceWithDiscaunt = price - discount;
        System.out.println("The final price is: " + priceWithDiscaunt + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
}