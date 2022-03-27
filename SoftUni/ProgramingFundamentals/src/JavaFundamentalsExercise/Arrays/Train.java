package JavaFundamentalsExercise.Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] passengers = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            int countPassengers = Integer.parseInt(scanner.nextLine());
            passengers[i] = countPassengers;
        }
        for (int i : passengers) {
            System.out.print(i);
            System.out.print(" ");
            sum += i;
        }
        System.out.printf("%n%d", sum);
    }
}
