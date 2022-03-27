package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double worldRecord = Double.parseDouble(scanner.nextLine());
            double distance = Double.parseDouble(scanner.nextLine());
            double time = Double.parseDouble(scanner.nextLine());
            double timeForDistance = distance * time;
            double addedTime = Math.floor(distance / 15) * 12.5;
            double finalTime = timeForDistance + addedTime;
            double difference = Math.abs(worldRecord - finalTime);

        if (finalTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);

        }    else{

            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
