package Exercise.WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String book = scanner.nextLine();
        int count = 0;
        boolean wasFound = false;
        while (!book.equals("No More Books")){
            if (book.equals(searchedBook)){
                wasFound = true;
                break;
            }
            count++;
            book = scanner.nextLine();
        }
        if (wasFound){
            System.out.printf("You checked %d books and found it.", count);
        }else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", count);

        }
    }
}
