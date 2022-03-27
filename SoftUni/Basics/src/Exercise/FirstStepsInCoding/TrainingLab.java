package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        if (3 <= h) {
            if (h <= w) {
                if (w <= 100) {
                    double numPlacesPerRow = (h - 1) / 0.7;
                    numPlacesPerRow = Math.floor(numPlacesPerRow);
                    double countRows = w / 1.20;
                    countRows = Math.floor(countRows);
                    double allPlaces = numPlacesPerRow * countRows - 3;
                    int allPlacesInt = (int) Math.floor(allPlaces);
                    System.out.println(allPlacesInt);
                }
            }
        }
    }
}
