package Exercise.NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String nameOfPresentation = scanner.nextLine();
        double finalAssessment = 0.0;
        int countPresentations = 0;

        while (!nameOfPresentation.equals("Finish")){
                double presentationGrade = 0;
            for (int i = 1; i <= n; i++){
                double grade = Double.parseDouble(scanner.nextLine());
                presentationGrade = presentationGrade + grade;
            }
            double presentationAverage = presentationGrade / n;
            finalAssessment = finalAssessment + presentationAverage;
            countPresentations++;
            System.out.printf("%s - %.2f.%n", nameOfPresentation, presentationAverage);
            nameOfPresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalAssessment / countPresentations);
    }
}
