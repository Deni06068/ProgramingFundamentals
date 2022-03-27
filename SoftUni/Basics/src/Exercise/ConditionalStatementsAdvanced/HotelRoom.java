package Exercise.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPricePerNight = 0.0;
        double apartmentPricePerNight = 0.0;

        switch (month){
            case "May":
            case "October":
                studioPricePerNight = 50;
                apartmentPricePerNight = 65;
                break;
            case "June":
            case "September":
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
                break;
            case "July":
            case "August":
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
                break;
        }
        double finalPriceStudio = studioPricePerNight * nights;
        double finalPriceApartment = apartmentPricePerNight * nights;
        if (nights > 7 && nights <=14 && (month.equals("May") || month.equals("October"))){
            finalPriceStudio = finalPriceStudio - (finalPriceStudio * 0.05);

        }else if (nights > 14){
            finalPriceApartment = finalPriceApartment - (finalPriceApartment * 0.10);
            if (month.equals("May") || month.equals("October")) {
                finalPriceStudio = finalPriceStudio - (finalPriceStudio * 0.30);
            }else if (month.equals("June") || month.equals("September")){
                finalPriceStudio = finalPriceStudio - (finalPriceStudio * 0.20);
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", finalPriceApartment, finalPriceStudio);
    }
}
