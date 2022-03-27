package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double sumdogFood = dogFood * 2.50;
        double sumcatFood = catFood * 4;
        System.out.println(sumdogFood + sumcatFood);
    }
}
