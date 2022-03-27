package Lab.ForLoop;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i <n; i++){
            if (i % 2 == 0) {
                int odd = Integer.parseInt(scanner.nextLine());
//            int even = Integer.parseInt(scanner.nextLine());
                sumOdd = sumOdd + odd;
//            sumEven = sumEven + even;
            }else {
                int even = Integer.parseInt(scanner.nextLine());
                sumEven = sumEven + even;

            }
        }
        if (sumOdd == sumEven){
            System.out.printf("Yes%nSum = %d",sumOdd);

        }else {
            int diff = Math.abs(sumOdd - sumEven);
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
