package Exercise.NestedLoops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (current > n){
                    isBigger = true;
                    break;
                }else {
                    System.out.print(current + " ");
                    current++;
                }
            }
            System.out.println();
        }
    }
}
