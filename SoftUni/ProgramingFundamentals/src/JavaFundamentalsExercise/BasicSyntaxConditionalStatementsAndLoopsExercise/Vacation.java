package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerOne = 0.0;

        switch (type){
            case "Students":
                switch (day){
                    case "Friday":
                        pricePerOne = 8.45;
                        break;
                    case "Saturday":
                        pricePerOne = 9.80;
                        break;
                    case "Sunday":
                        pricePerOne = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day){
                    case "Friday":
                        pricePerOne = 10.90;
                        break;
                    case "Saturday":
                        pricePerOne = 15.60;
                        break;
                    case "Sunday":
                        pricePerOne = 16.0;
                        break;
                }
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        pricePerOne = 15;
                        break;
                    case "Saturday":
                        pricePerOne = 20;
                        break;
                    case "Sunday":
                        pricePerOne = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = numPeople * pricePerOne;

        if (type.equals("Students") && numPeople >= 30){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }else if (type.equals("Business") && numPeople >= 100){
            totalPrice = (numPeople - 10) * pricePerOne;
        }else if (type.equals("Regular") && (numPeople >= 10 && numPeople <= 20)){
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        System.out.printf("Total price: %.2f", totalPrice);


    }
}
