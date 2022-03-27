package Exercise.Exam;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFirstNum = Integer.parseInt(scanner.nextLine());
        int maxSecondNum = Integer.parseInt(scanner.nextLine());
        int maxThirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxFirstNum; i++){
            if (i % 2 == 0) {
                for (int j = 1; j <= maxSecondNum; j++) {
                    int countJ = 0;
                    for (int n = 1; n <= j; n++) {
                        if (j % n == 0) {
                            countJ++;
                        }
                    }
                        if (countJ == 2){
                            for (int k = 1; k <= maxThirdNum; k++){
                                if (k % 2 == 0){
                                    System.out.printf("%d %d %d%n", i, j, k);
                                }else
                                    continue;
                            }
                        }
                    }


            }
        }
    }
}
