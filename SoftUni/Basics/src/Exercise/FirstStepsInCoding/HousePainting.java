package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine()); //Височината на къщата
        double y = Double.parseDouble(scanner.nextLine()); //Дължината на страничната стена
        double h = Double.parseDouble(scanner.nextLine()); //Височината на триъгълната стена на покрива
        double frontAndBackWall = ((x * x) - (1.2 * 2)) + (x * x);
        double sideWalls = ((x * y) - (1.5 * 1.5)) * 2;
        double roofSideWalls = (x * y) * 2;
        double roofFrontAndBack = (x * h / 2) * 2;
        double green = (frontAndBackWall + sideWalls) / 3.4;
        double red = (roofSideWalls + roofFrontAndBack) / 4.3;
        System.out.printf("%.2f%n%.2f", green, red);

    }
}
