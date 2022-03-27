package Lab.WhileLoop;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int start = 1;

        while (start <= number){
            System.out.println(start);
            start = start * 2 + 1;
        }
    }
}
