package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int finalTime = hour * 60 + min + 15;
        int finalHour = finalTime / 60;
        int finalMin = finalTime % 60;

        if (finalHour > 23){
            finalHour = 24 - finalHour;
        }
            System.out.printf("%d:%02d%n", finalHour, finalMin);
        }

    }
