package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double volumeSm = length * width * height;
        double volumeDm = volumeSm / 1000;
        double water = volumeDm * (1 - percent);
        System.out.println(water);

    }
}
