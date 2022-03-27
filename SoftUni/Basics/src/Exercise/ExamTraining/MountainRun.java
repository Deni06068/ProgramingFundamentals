package Exercise.ExamTraining;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerOneMeter = Double.parseDouble(scanner.nextLine());
        double slowingInSecs = 30 * (Math.floor(distance / 50));
        double timeForClimbing = (distance * secPerOneMeter) + slowingInSecs;
        double diff = Math.abs(worldRecord - timeForClimbing);

        if (worldRecord > timeForClimbing){
            System.out.printf("Yes! The new record is %.2f seconds.", timeForClimbing);
        }else{
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}
