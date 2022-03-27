package Exercise.ConditionalStatementsAdvanced;

import java.awt.*;
import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int stay = Integer.parseInt(scanner.nextLine());
        double pricePerOne = 0.0;
        String sport = "";

        switch (season){
            case "Winter":
                switch (group){
                    case "girls":
                        pricePerOne = 9.60;
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        pricePerOne = 9.60;
                        sport = "Judo";
                        break;
                    case "mixed":
                        pricePerOne = 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (group){
                    case "girls":
                        pricePerOne = 7.20;
                        sport = "Athletics";
                        break;
                    case "boys":
                        pricePerOne = 7.20;
                        sport = "Tennis";
                        break;
                    case "mixed":
                        pricePerOne = 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (group){
                    case "girls":
                        pricePerOne = 15;
                        sport = "Volleyball";
                        break;
                    case "boys":
                        pricePerOne = 15;
                        sport = "Football";
                        break;
                    case "mixed":
                        pricePerOne = 20;
                        sport = "Swimming";
                        break;
                }
        }
        double finalPrice = countStudents * pricePerOne * stay;
        if (countStudents >= 50){
            finalPrice = finalPrice * 0.50;
        }else if (countStudents >= 20){
            finalPrice = finalPrice * 0.85;
        }else if (countStudents >= 10) {
            finalPrice = finalPrice * 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, finalPrice);
    }
}
