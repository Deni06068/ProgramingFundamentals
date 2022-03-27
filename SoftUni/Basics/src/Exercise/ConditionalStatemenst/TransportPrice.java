package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой километри
        String time = scanner.nextLine(); //day or night
        double taxiDay = 0.70 + (0.79 * n);
        double taxiNight = 0.70 + (0.90 * n);
        double bus = 0.09 * n;
        double train = 0.06 * n;

        if (n < 20) {
            if (time.equals("day")){
                System.out.printf("%.2f", taxiDay);
            }else if (time.equals("night")){
                System.out.printf("%.2f", taxiNight);
            }


        }else if (n < 100){
                System.out.printf("%.2f",bus);


        }else {
            System.out.printf("%.2f", train);
        }

    }
}
