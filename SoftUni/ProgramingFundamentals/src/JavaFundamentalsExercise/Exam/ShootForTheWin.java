package JavaFundamentalsExercise.Exam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int shootTargets = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index >= 0 && index < targets.length) {
                int targetOfIndex = targets[index];

                for (int i = 0; i < targets.length; i++) {
                    if (i != index && targets[i] != -1) {
                        if (targets[i] > targetOfIndex) {
                            targets[i] -= targetOfIndex;
                        } else {
                            targets[i] += targetOfIndex;
                        }
                    } else if (i == index) {
                        shootTargets++;
                        targets[i] = -1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.print("Shot targets: " + shootTargets + " -> ");
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i] + " ");
        }
    }
}
