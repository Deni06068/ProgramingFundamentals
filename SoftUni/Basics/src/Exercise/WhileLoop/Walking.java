package Exercise.WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine();
        int totalSteps = 0;
        boolean goingHome = true;

        while (!steps.equals("Going home")){
            int stepsInt = Integer.parseInt(steps);
            totalSteps = totalSteps + stepsInt;
            if (totalSteps < 10000){
                steps = scanner.nextLine();
                continue;
            }else {
                goingHome = false;
                break;
            }
        }
        if (goingHome){
            steps = scanner.nextLine();
            int stepsInt = Integer.parseInt(steps);
            totalSteps = totalSteps + stepsInt;
            if (totalSteps>= 10000){
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - 10000);
            }else{
                System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
            }
        }else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - 10000);
        }
    }
}
