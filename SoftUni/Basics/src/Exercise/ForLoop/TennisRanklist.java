package Exercise.ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tours = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int winPoints = 0;
        int winTours = 0;

        for (int i = 0; i < tours; i++){
            String placeOfTour = scanner.nextLine();
            switch (placeOfTour){
                case "W":
                    winPoints = winPoints + 2000;
                    winTours = winTours + 1;
                    break;
                case "F":
                    winPoints = winPoints + 1200;
                    break;
                case "SF":
                    winPoints = winPoints + 720;
                    break;
            }
        }
        int allPoints = startingPoints + winPoints;
        double averagePoints = Math.floor(winPoints * 1.0 / tours);
        double percentWinnings = winTours * 1.0 / tours * 100;

        System.out.printf("Final points: %d%n", allPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", percentWinnings);

    }
}
