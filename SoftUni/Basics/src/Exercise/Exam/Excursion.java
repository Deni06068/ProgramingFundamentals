package Exercise.Exam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int ticketsMuseum = Integer.parseInt(scanner.nextLine());

        int sumNightsPerOne = nights * 20;
        double transportCardsSum = transportCards * 1.60;
        double ticketsMuseumSum = ticketsMuseum * 6;

        double sumOnePerson = sumNightsPerOne + transportCardsSum + ticketsMuseumSum;
        double sumAll = sumOnePerson * people;
        double finalSum = sumAll + (sumAll * 0.25);

        System.out.printf("%.2f", finalSum);
    }
}
