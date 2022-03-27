package Exercise.ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfActor = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int assets = Integer.parseInt(scanner.nextLine());
        double allPoints = 0.0;

        for (int i = 0; i < assets; i++){
            if((allPoints + pointsOfAcademy) < 1250.5) {
                String nameOfAsset = scanner.nextLine();
                double pointsOfAsset = Double.parseDouble(scanner.nextLine());

                int pointsOfName = nameOfAsset.length();
                allPoints =allPoints + (pointsOfAsset * pointsOfName / 2);
            }
        }
        double finalPoints = pointsOfAcademy + allPoints;
        if (finalPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, finalPoints);
        }else {
            double diff = 1250.5 - finalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, diff);
        }
    }
}
