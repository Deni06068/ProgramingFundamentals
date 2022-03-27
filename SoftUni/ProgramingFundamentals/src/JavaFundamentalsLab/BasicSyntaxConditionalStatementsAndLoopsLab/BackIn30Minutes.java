package JavaFundamentalsLab.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hours * 60 + minutes;
        int newTime = time + 30;
        int newHours = newTime / 60;
        int newMinutes = newTime % 60;
        if (newHours > 23){
            newHours = 0;
        }

        System.out.printf("%d:%02d", newHours, newMinutes);
    }
}
