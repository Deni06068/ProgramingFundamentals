package Lab.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        boolean valid = true;

        if (city.equals("Sofia")){
            if (0 <= sales && sales <= 500){
                commission = sales * 0.05;
            }else if (500 < sales && sales <= 1000){
                commission = sales * 0.07;
            }else if (1000 < sales && sales <= 10000){
                commission = sales * 0.08;
            }else if (sales > 10000){
                commission = sales * 0.12;
            }else
                valid = false;
        }else if (city.equals("Varna")){
            if (0 <= sales && sales <= 500){
                commission = sales * 0.045;
            }else if (500 < sales && sales <= 1000){
                commission = sales * 0.075;
            }else if (1000 < sales && sales <= 10000){
                commission = sales * 0.10;
            }else if (sales > 10000){
                commission = sales * 0.13;
            }else
                valid = false;
        }else if (city.equals("Plovdiv")){
            if (0 <= sales && sales <= 500){
                commission = sales * 0.055;
            }else if (500< sales && sales <= 1000){
                commission = sales * 0.08;
            }else if (1000 < sales && sales <= 10000){
                commission = sales * 0.12;
            }else if (sales > 10000){
                commission = sales * 0.145;
            }else
                valid = false;
        }else{
            valid = false;
        }
        if (valid){
            System.out.printf("%.2f", commission);

        }else
            System.out.println("error");
    }
}
