package JavaFundamentalsExercise.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());

        String sms = "";
        for (int j = 0; j < lenght; j++) {
            String input = scanner.nextLine();
             int inputNumber = Integer.parseInt(input);
             int button = inputNumber % 10;
             int i = input.length();

            if (button == 2 && i == 1) {
                sms = sms + "a";
            } else if (button == 2 && i == 2) {
                sms = sms + "b";
            } else if (button == 2 && i == 3) {
                sms = sms + "c";
            } else if (button == 3 && i == 1) {
                sms = sms + "d";
            } else if (button == 3 && i == 2) {
                sms = sms + "e";
            } else if (button == 3 && i == 3) {
                sms = sms + "f";
            } else if (button == 4 && i == 1) {
                sms = sms + "g";
            } else if (button == 4 && i == 2) {
                sms = sms + "h";
            } else if (button == 4 && i == 3) {
                sms = sms + "i";
            } else if (button == 5 && i == 1) {
                sms = sms + "j";
            } else if (button == 5 && i == 2) {
                sms = sms + "k";
            } else if (button == 5 && i == 3) {
                sms = sms + "l";
            } else if (button == 6 && i == 1) {
                sms = sms + "m";
            } else if (button == 6 && i == 2) {
                sms = sms + "n";
            } else if (button == 6 && i == 3) {
                sms = sms + "o";
            } else if (button == 7 && i == 1) {
                sms = sms + "p";
            } else if (button == 7 && i == 2) {
                sms = sms + "q";
            } else if (button == 7 && i == 3) {
                sms = sms + "r";
            } else if (button == 7 && i == 4) {
                sms = sms + "s";
            } else if (button == 8 && i == 1) {
                sms = sms + "t";
            } else if (button == 8 && i == 2) {
                sms = sms + "u";
            } else if (button == 8 && i == 3) {
                sms = sms + "v";
            } else if (button == 9 && i == 1) {
                sms = sms + "w";
            } else if (button == 9 && i == 2) {
                sms = sms + "x";
            } else if (button == 9 && i == 3) {
                sms = sms + "y";
            } else if (button == 9 && i == 4) {
                sms = sms + "z";
            } else if (button == 0) {
                sms = sms + " ";
            }
        }
        System.out.println(sms);
    }
}
