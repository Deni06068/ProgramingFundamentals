package Exercise.ForLoop;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double minOdd = Integer.MAX_VALUE;
        double maxOdd = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double maxEven = Integer.MIN_VALUE;

        for (int i = 1; i<= numbers; i++){
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 1){
                oddSum = oddSum + num;
                if (minOdd > num){
                    minOdd = num;
                }
                if (maxOdd < num){
                    maxOdd = num;
                }
            }else {
                evenSum = evenSum + num;
                if (minEven > num){
                    minEven = num;
                }
                if (maxEven < num){
                    maxEven = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum != 0) {
            System.out.printf("OddMin=%.2f,%n", minOdd);
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }else{
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum != 0) {
            System.out.printf("EvenMin=%.2f,%n", minEven);
            System.out.printf("EvenMax=%.2f%n", maxEven);
        }else {
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No%n");
        }
    }
}
