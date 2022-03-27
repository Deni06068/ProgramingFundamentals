package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int brokenHeadset = 0;
        int brokenMouse = 0;
        int brokenKeyboard = 0;
        int brokenDisplay = 0;
        boolean isBrokenHeadset = false;
        boolean isBrokenMouse = false;
        boolean isBrokenKeyboard = false;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0){
                brokenHeadset++;
                isBrokenHeadset = true;
            }
            if ( i % 3 == 0){
                brokenMouse++;
                if (isBrokenHeadset){
                    isBrokenMouse = true;
                }
            }
            if (isBrokenHeadset && isBrokenMouse){
                brokenKeyboard++;
                isBrokenKeyboard = true;
            }
            if (isBrokenKeyboard && brokenKeyboard > 0 && brokenKeyboard % 2 == 0){
                brokenDisplay++;
            }
            isBrokenHeadset = false;
            isBrokenMouse = false;
            isBrokenKeyboard = false;
        }
        double expenses = (headsetPrice * brokenHeadset) + (mousePrice * brokenMouse) + (keyboardPrice * brokenKeyboard) + (displayPrice * brokenDisplay);
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
