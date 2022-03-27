package Exercise.WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wightApartment = Integer.parseInt(scanner.nextLine());
        int lengthApartment = Integer.parseInt(scanner.nextLine());
        int heightApartment = Integer.parseInt(scanner.nextLine());
        int apartment = wightApartment * lengthApartment * heightApartment;
        String boxes = scanner.nextLine();
        int boxesLeft = 0;
        boolean isLeft = false;

        while (!boxes.equals("Done")){
            int boxesInt = Integer.parseInt(boxes);
            if (boxesInt <= apartment){
                apartment = apartment - boxesInt;
                isLeft = true;
            }else {
                boxesLeft = boxesInt - apartment;
                isLeft = false;
                break;
            }
            boxes = scanner.nextLine();
        }
        if (!isLeft){
            System.out.printf("No more free space! You need %d Cubic meters more.", boxesLeft);
        }else {
            System.out.printf("%d Cubic meters left.", apartment);
        }
    }
}
