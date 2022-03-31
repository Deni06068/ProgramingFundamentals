package JavaFundamentalsExercise.PracticeTests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(@#+)(?<barcode>([A-Z][[a-z]*[\\d]*]{4,}[A-Z]))\\1");
        Pattern digits = Pattern.compile("\\d+");
        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                Matcher digitsMatcher = digits.matcher(matcher.group("barcode"));
                StringBuilder sb = new StringBuilder(matcher.group("barcode"));
                String group = "0";
                if (digitsMatcher.find()){
                    group = digitsMatcher.group();
                }
                System.out.println("Product group: " + group);
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
