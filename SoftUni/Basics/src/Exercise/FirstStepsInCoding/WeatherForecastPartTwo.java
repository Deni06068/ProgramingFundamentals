package Exercise.FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecastPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = Double.parseDouble(scanner.nextLine());
        if (temp > 35){
            System.out.printf("unknown");
        }else if (temp >= 26){
            System.out.printf("Hot");
        }else if (temp >= 20.1){
            System.out.printf("Warm");
        }else if (temp >= 15){
            System.out.printf("Mild");
        }else if (temp >= 12){
            System.out.printf("Cool");
        }else if (temp >= 5){
            System.out.printf("Cold");
        }else{
            System.out.printf("unknown");
        }
    }
}
