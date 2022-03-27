package JavaFundamentalsExercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] positionsOfBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[fieldSize];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < positionsOfBugs.length; j++) {
                if (i == positionsOfBugs[j]) {
                    field[i] = 1;
                }
            }
        }
        String bugMove = scanner.nextLine();
        while (!bugMove.equals("end")) {
            String[] data = bugMove.split(" ");
            int bugPosition = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyPositions = Integer.parseInt(data[2]);
            if (bugPosition < 0 || bugPosition >= field.length || field[bugPosition] != 1){
                bugMove = scanner.nextLine();
                continue;
            }
            if (direction.equals("right")){
                field[bugPosition] = 0;
                if (bugPosition + flyPositions >= field.length){
                    continue;
                }
                for (int i = bugPosition + flyPositions ; i < field.length; i+= flyPositions) {
                    if (field[i] == 1) {
                        continue;
                    }else{
                        field[i] = 1;
                        break;
                    }
                }
            }else if (direction.equals("left")) {
                field[bugPosition] = 0;
                if (bugPosition - flyPositions < 0){
                    continue;
                }
                for (int i = bugPosition - flyPositions ; i >= 0; i-=flyPositions) {
                    if (field[i] == 1){
                        continue;
                    }else{
                        field[i] = 1;
                        break;
                    }
                }
            }
            bugMove = scanner.nextLine();
        }
        Arrays.stream(field).forEach(value -> System.out.print(value + " "));
    }
}
