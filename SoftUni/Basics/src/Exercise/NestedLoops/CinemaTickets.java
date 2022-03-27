package Exercise.NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int allTakenSeats = 0;
            String takenSeat = scanner.nextLine();
            while (!takenSeat.equals("End")){
                switch (takenSeat){
                        case "student":
                            totalTickets++;
                            allTakenSeats++;
                            studentTickets++;
                            break;
                        case "standard":
                            totalTickets++;
                            allTakenSeats++;
                            standardTickets++;
                            break;
                        case "kid":
                            totalTickets++;
                            allTakenSeats++;
                            kidTickets++;
                            break;
                }
                if (allTakenSeats == freeSeats){
                    break;
                }
                    takenSeat = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie,(1.0 * allTakenSeats) / freeSeats * 100);
            movie = scanner.nextLine();
        }
        double percentStudent = studentTickets * 1.0 / totalTickets * 100;
        double percentStandard = standardTickets * 1.0 / totalTickets * 100;
        double percentKid = kidTickets * 1.0 / totalTickets * 100;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentKid);
    }
}
