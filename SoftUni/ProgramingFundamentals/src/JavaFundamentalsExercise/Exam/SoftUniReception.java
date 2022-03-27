package JavaFundamentalsExercise.Exam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstReceptionist = Integer.parseInt(scanner.nextLine());
        int secondReceptionist = Integer.parseInt(scanner.nextLine());
        int thirdReceptionist = Integer.parseInt(scanner.nextLine());
        int studentsPerHour = firstReceptionist + secondReceptionist + thirdReceptionist;
        int students = Integer.parseInt(scanner.nextLine());
        int hours = 0;

        while (students != 0) {
            hours++;
            if (hours % 4 != 0) {
                students -= studentsPerHour;
            }
            if (students <= 0){
                students = 0;
            }

        }
        System.out.println("Time needed: " + hours + "h.");
    }
}
