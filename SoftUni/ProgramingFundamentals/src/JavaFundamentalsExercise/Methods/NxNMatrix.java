package JavaFundamentalsExercise.Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        printLines(num);

    }
    public static void printLines (int num){
        for (int i = 0; i < num; i++) {
            printNumsInRow(num);
            System.out.println();
        }
    }
    public static void printNumsInRow (int num){
        for (int i = 0; i < num; i++) {
            System.out.print(num + " ");
        }
    }
}
