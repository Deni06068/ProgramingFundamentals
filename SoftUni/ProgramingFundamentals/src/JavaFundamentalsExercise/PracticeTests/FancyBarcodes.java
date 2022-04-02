package JavaFundamentalsExercise.PracticeTests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(@#+)(?<barcode>([A-Z][A-Za-z\\d]{4,}[A-Z]))(@#+)");
        Pattern digits = Pattern.compile("\\d+");
        for (int i = 0; i < lines; i++) {
            StringBuilder sbDigit = new StringBuilder();
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                Matcher digitsMatcher = digits.matcher(matcher.group("barcode"));
                while (digitsMatcher.find()){
                    sbDigit.append(digitsMatcher.group());
                }
                if (sbDigit.length() == 0){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + sbDigit);
                }
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
