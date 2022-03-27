package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radians = Double.parseDouble(scanner.nextLine());
        Double radius = radians * 180 / Math.PI;
        System.out.println(radius);
    }
}
