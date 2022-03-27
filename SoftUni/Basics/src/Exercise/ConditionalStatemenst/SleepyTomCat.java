package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - freeDays;
        int playAtFreeDays = freeDays * 127;
        int playAtWorkDays = workDays * 63;
        int timeForSleep = 30000 - (playAtFreeDays + playAtWorkDays);
        int timeForSleepAbs = Math.abs(30000 - (playAtFreeDays + playAtWorkDays));
        int timeHours = timeForSleepAbs / 60;
        int timeMins = timeForSleepAbs % 60;
        if (timeForSleep < 0){
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", timeHours, timeMins);
        }else{
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", timeHours, timeMins);
        }
    }
}
