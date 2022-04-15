package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] nums = scanner.nextLine().split("\s++");
            int n1 = Integer.parseInt(nums[0]);
            int n2 = Integer.parseInt(nums[1]);
            int result = 0;
            if (n1 > n2) {
                while (n1 > 0) {
                    result = result + (n1 % 10);
                    n1 = n1 / 10;
                }
            } else {
                while (n2 > 0) {
                    result = result + (n2 % 10);
                    n2 = n2 / 10;
                }
            }
            System.out.println(result);
        }
    }
}
