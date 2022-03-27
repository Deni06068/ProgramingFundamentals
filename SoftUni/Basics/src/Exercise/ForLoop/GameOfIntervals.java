package Exercise.ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double from0To9 = 0;
        double from10To19 = 0;
        double from20To29 = 0;
        double from30To39 = 0;
        double from40To50 = 0;
        double invalid = 0;

        for (int i = 1; i <= count; i++){
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 0){
                invalid++;
                result = result / 2;
                continue;
            }else if (num < 10 && num >= 0){
                result = result + (num * 0.2);
                from0To9++;
            }else if (num < 20){
                result = result + (num * 0.3);
                from10To19++;
            }else if (num < 30){
                result = result + (num * 0.4);
                from20To29++;
            }else if (num < 40){
                result = result + 50;
                from30To39++;
            }else if (num <= 50){
                result = result + 100;
                from40To50++;
            }else {
                invalid++;
                result = result / 2;
                continue;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", from0To9 / count * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", from10To19 / count * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", from20To29 / count * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", from30To39 / count * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", from40To50 / count * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid / count * 100);

    }
}
