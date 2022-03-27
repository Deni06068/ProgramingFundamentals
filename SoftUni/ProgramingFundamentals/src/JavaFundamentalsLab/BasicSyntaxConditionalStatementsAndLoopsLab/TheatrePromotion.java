package JavaFundamentalsLab.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isValid = true;
        switch (day){
            case "Weekday":
                if (0 <= age && age <= 18){
                    price = 12;
                }else if ( 18 < age && age <= 64){
                    price = 18;
                }else if ( 64 < age && age <= 122){
                    price = 12;
                }else {
                    isValid = false;
                }
                break;
            case "Weekend":
                if (0 <= age && age <= 18){
                    price = 15;
                }else if ( 18 < age && age <= 64){
                    price = 20;
                }else if ( 64 < age && age <= 122){
                    price = 15;
                }else {
                    isValid = false;
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18){
                    price = 5;
                }else if ( 18 < age && age <= 64){
                    price = 12;
                }else if ( 64 < age && age <= 122){
                    price = 10;
                }else {
                    isValid = false;
                }
                break;
        }
        if (isValid){
            System.out.printf("%d$", price);
        }else {
            System.out.println("Error!");
        }
    }
}
