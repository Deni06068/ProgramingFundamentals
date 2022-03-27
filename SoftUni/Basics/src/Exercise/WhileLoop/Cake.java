package Exercise.WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wightCake = Integer.parseInt(scanner.nextLine());
        int heightCake = Integer.parseInt(scanner.nextLine());
        int allCake = wightCake * heightCake;
        String pieces = scanner.nextLine();
        int piecesNeeded = 0;
        boolean isCake = false;

        while (!pieces.equals("STOP")){
            int piecesInt = Integer.parseInt(pieces);
            if (allCake >= piecesInt){
                allCake = allCake - piecesInt;
                isCake = true;
            }else {
                piecesNeeded = piecesInt - allCake;
                isCake = false;
                break;
            }
            pieces = scanner.nextLine();
        }
        if (!isCake){
            System.out.printf("No more cake left! You need %d pieces more.", piecesNeeded);
        }else
            System.out.printf("%d pieces are left.", allCake);
    }
}
