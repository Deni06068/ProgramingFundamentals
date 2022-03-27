package Exercise.NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++){
            String currentNum = "" + i;
                int count = 0;
            for (int j = 0; j < currentNum.length(); j++){
                int currentNumber = Integer.parseInt("" + currentNum.charAt(j));
                if (currentNumber == 0){
                    break;
                }else if (n % currentNumber == 0){
                    count++;
                    continue;
                }else
                    break;
            }
                if (count == 4){
                    System.out.print(currentNum + " ");
                }else {
                    continue;
                }
        }
    }
}
