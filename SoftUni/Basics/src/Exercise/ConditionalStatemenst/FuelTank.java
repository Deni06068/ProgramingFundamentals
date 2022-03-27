package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double litresInTank = Double.parseDouble(scanner.nextLine());
        if (fuel.equals("Diesel")){
            if (litresInTank >= 25){
                System.out.printf("You have enough diesel.");
            }else{
                System.out.printf("Fill your tank with diesel!");

            }
        }else if(fuel.equals("Gasoline")) {
            if (litresInTank >= 25) {
                System.out.printf("You have enough gasoline.");
            } else {
                System.out.printf("Fill your tank with gasoline!");
            }
        }else if (fuel.equals("Gas")) {
            if (litresInTank >= 25) {
                System.out.printf("You have enough gas.");
            } else {
                System.out.printf("Fill your tank with gas!");
            }
        }else {
            System.out.printf("Invalid fuel!");
        }
    }
}
