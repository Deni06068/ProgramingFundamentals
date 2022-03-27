package Exercise.Exam;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double countLitres = 0.0;
        double countDegrees = 0.0;

        for ( int i = 1; i <= days; i++) {
            double litres = Double.parseDouble(scanner.nextLine());
            countLitres+= litres;
            double degrees = Double.parseDouble(scanner.nextLine());
            countDegrees = countDegrees + (degrees * litres);
        }
        double averageDegrees = countDegrees / countLitres;
        System.out.printf("Liter: %.2f%n", countLitres);
        System.out.printf("Degrees: %.2f%n", averageDegrees);

        if (averageDegrees < 38){
            System.out.println("Not good, you should baking!");
        }else if (averageDegrees <= 42){
            System.out.println("Super!");
        }else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
