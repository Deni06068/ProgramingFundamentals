package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Weather = scanner.nextLine();
        if (Weather.equals("sunny")){
            System.out.printf("It's warm outside!");
        }else
            System.out.printf("It's cold outside!");

    }
}
