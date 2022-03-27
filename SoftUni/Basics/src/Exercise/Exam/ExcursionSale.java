package Exercise.Exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seaTrip = Integer.parseInt(scanner.nextLine());
        int mountTrip = Integer.parseInt(scanner.nextLine());
        String tripType = scanner.nextLine();
        int countSeaTrips = 0;
        int countMountTrips = 0;

        int sumSeaTrip = 0;
        int sumMountTrip = 0;

        while (!tripType.equals("Stop")){
            switch (tripType){
                case "sea":
                    countSeaTrips++;
                    if (countSeaTrips <= seaTrip) {
                        sumSeaTrip += 680;
                    }else {
                        tripType = scanner.nextLine();
                        continue;
                    }
                    break;
                case "mountain":
                    countMountTrips++;
                    if (countMountTrips <= mountTrip) {
                        sumMountTrip += 499;
                    }else {
                        tripType = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            if (countSeaTrips >= seaTrip && countMountTrips >= mountTrip){
                break;
            }
            tripType = scanner.nextLine();
        }
        if (countSeaTrips >= seaTrip && countMountTrips >= mountTrip){
            System.out.printf("Good job! Everything is sold.%n");
        }
        System.out.printf("Profit: %d leva.", sumSeaTrip + sumMountTrip);
    }
}
