package Lab.NestedLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int x1 = 0; x1 <= result; x1++){
            for (int x2 = 0; x2 <= result; x2++){
                for ( int x3 = 0; x3 <= result; x3++){
                    if (x1 + x2 + x3 == result) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
