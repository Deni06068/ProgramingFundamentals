package Exercise.WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fails = Integer.parseInt(scanner.nextLine());
        String exercise = scanner.nextLine();
        String lastExercise = "";
        int allScore = 0;
        int countExercises = 0;
        int countFails = 0;
        boolean fail = false;

        while (!exercise.equals("Enough")) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score <= 4){
                countFails++;
            }
            if (countFails == fails){
                fail = true;
                break;
            }
            allScore+=score;
            countExercises++;
            lastExercise = exercise;
            exercise = scanner.nextLine();

        }
        double averageScore = allScore * 1.0 / countExercises;
        if (fail){
            System.out.printf("You need a break, %d poor grades.", countFails);
        }else {
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", countExercises);
            System.out.printf("Last problem: %s", lastExercise);
        }
    }
}
