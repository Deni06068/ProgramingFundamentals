package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int movieTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double relaxTime = breakTime / 4.0;
        double timeForWatching = breakTime - (lunchTime + relaxTime);
        double leftTime = Math.ceil(Math.abs(movieTime - timeForWatching));

         if (movieTime <= timeForWatching){
             System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, leftTime);
         }else
             System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",movie, leftTime);
    }
}
