package Exercise.ExamTraining;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minsWalk = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int allMinsWalk = minsWalk * walks;
        int burnedCalories = allMinsWalk * 5;
        double caloriesToBurn = calories / 2.0;
        if (burnedCalories >= caloriesToBurn){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);

        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
