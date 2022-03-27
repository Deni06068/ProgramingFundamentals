package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double gpuPrice = gpu * 250;
        double cpuPrice = cpu * (gpuPrice * 0.35);
        double ramPrice = ram * (gpuPrice * 0.10);
        double allPrice = gpuPrice + cpuPrice + ramPrice;

        if (gpu > cpu){
            allPrice = allPrice * 0.85;

        }

        double difference = Math.abs(budget - allPrice);

        if (budget >= allPrice){
            System.out.printf("You have %.2f leva left!", difference);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
