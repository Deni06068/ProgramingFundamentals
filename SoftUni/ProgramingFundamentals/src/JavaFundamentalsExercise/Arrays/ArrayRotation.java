package JavaFundamentalsExercise.Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        int overRotation = rotations % array.length;

        for (int i = rotations; i < array.length + rotations; i++) {
            if (rotations < array.length) {
                if (i <= array.length - 1) {
                    System.out.print(array[i] + " ");
                } else {
                    System.out.print(array[i - array.length] + " ");
                }
            } else {
                for (int j = overRotation; j < array.length + overRotation; j++) {
                    if (j <= array.length - 1) {
                        System.out.print(array[j] + " ");
                    } else {
                        System.out.print(array[j - array.length] + " ");

                    }
                }
                break;
            }
        }
    }
}
