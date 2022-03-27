package JavaFundamentalsExercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactoryTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] DNA = new String[n];
        int bestPosition = 0;
        int currentPosition = 0;
        int maxSum = 0;
        int currentSumElements = 0;
        int maxLength = 0;
        int currentLength = 0;
        int dnaNumber = 0;
        int bestDnaNumber = 0;
        String[] result = new String[n];
        String bestLocalDna = "";

        String line = scanner.nextLine();

        while (!line.equals("Clone them!")){
            dnaNumber++;
            String data = line.replaceAll("!", "");
            DNA = data.split("0");

            for (int i = 0; i < DNA.length; i++) {
                currentSumElements += Integer.parseInt(DNA[i]);

                if (DNA[i].length() > currentLength){
                    currentLength = DNA[i].length();
                    bestLocalDna = DNA[i];
                }
            }
            currentPosition = data.indexOf(bestLocalDna);
            if (currentLength > maxLength){
                maxLength = currentLength;
                maxSum = currentSumElements;
                bestPosition = currentPosition;
                bestDnaNumber = dnaNumber;
                result = data.split("");
            }else if (currentLength == maxLength && (bestPosition > currentPosition || currentSumElements > maxSum)){
                maxLength = currentLength;
                maxSum = currentSumElements;
                bestPosition = currentPosition;
                bestDnaNumber = dnaNumber;
                result = data.split("");
            }

            line = scanner.nextLine();
        }

    }
}
