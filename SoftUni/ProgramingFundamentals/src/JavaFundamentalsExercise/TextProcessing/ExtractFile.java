package JavaFundamentalsExercise.TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String file;
        file = line.substring(line.lastIndexOf("\\") + 1);

        System.out.printf("File name: %s%n", file.substring(0, file.indexOf(".")));
        System.out.printf("File extension: %s%n", file.substring(file.indexOf(".") + 1));
    }
}
