package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hoursArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());
        String arrival = "";

        int timeExam = (hourExam * 60) + minExam;
        int timeArrive = (hoursArrive * 60) + minArrive;
        int diff = Math.abs(timeArrive - timeExam);
        int hoursDiff = diff / 60;
        int minDiff = diff % 60;

        if (timeArrive > timeExam){
            arrival = "Late";
            if (diff >= 60){
                System.out.printf("%s%n%d:%02d hours after the start", arrival, hoursDiff, minDiff);
            }else
            System.out.printf("%s%n%d minutes after the start", arrival, diff);
        }else if (timeArrive == timeExam){
            System.out.println("On time");
        }else if (timeArrive >= (timeExam - 30)){
            arrival = "On time";
            System.out.printf("%s%n%d minutes before the start", arrival, diff);
        }else {
            arrival = "Early";
            if (diff >= 60){
                System.out.printf("%s%n%d:%02d hours before the start", arrival, hoursDiff, minDiff);
            }else
                System.out.printf("%s%n%d minutes before the start", arrival, diff);
        }
    }
}
