package JavaFundamentalsExercise.Exam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberOfHearts = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int cupidPosition = 0;

        while (!command.equals("Love!")) {
            String[] jumpAsString = command.split(" ");
            int jump = Integer.parseInt(jumpAsString[1]);
            cupidPosition += jump;
            if (cupidPosition >= numberOfHearts.length) {
                cupidPosition = 0;
            }
            if (numberOfHearts[cupidPosition] > 0) {
                    if (numberOfHearts[cupidPosition] == 1) {
                        numberOfHearts[cupidPosition] = 0;
                    } else {
                        numberOfHearts[cupidPosition] -= 2;
                    }
                    if (numberOfHearts[cupidPosition] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", cupidPosition);
                    }
                }else {
                    System.out.printf("Place %d already had Valentine's day.%n", cupidPosition);
                }
            command = scanner.nextLine();
        }
        System.out.println("Cupid's last position was " + cupidPosition + "." );

        int failed = 0;
        for (int i = 0; i < numberOfHearts.length; i++) {
            if (numberOfHearts[i] != 0){
                failed++;
            }
        }
        if (failed != 0){
            System.out.printf("Cupid has failed %d places.", failed);
        }else {
            System.out.println("Mission was successful.");
        }
    }
}
