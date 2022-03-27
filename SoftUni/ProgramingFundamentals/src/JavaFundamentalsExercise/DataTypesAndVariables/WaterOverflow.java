package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int capacity = 0;

        for (int i = 0; i < lines; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            capacity = capacity + litres;
            if (capacity > 255){
                System.out.println("Insufficient capacity!");
                capacity = capacity - litres;
            }
        }
        System.out.println(capacity);

    }
}
