package JavaFundamentalsExercise.Exam;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder key = new StringBuilder(input);
        String command = scanner.nextLine();
        while (!command.equals("Generate")){
            String[] com = command.split(">>>");
            switch (com[0]){
                case "Contains":
                    String substring = com[1];
                    if (key.toString().contains(com[1])){
                        System.out.println(key + " contains " + substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(com[2]);
                    int endIndex = Integer.parseInt(com[3]);
                    switch (com[1]){
                        case "Upper":
                            key.replace(startIndex, endIndex,key.substring(startIndex, endIndex).toUpperCase());
                            System.out.println(key);
                            break;
                        case "Lower":
                            key.replace(startIndex, endIndex,key.substring(startIndex, endIndex).toLowerCase());
                            System.out.println(key);
                            break;
                    }
                    break;
                case "Slice":
                    int startIndexSlice = Integer.parseInt(com[1]);
                    int endIndexSlice = Integer.parseInt(com[2]);
                    key.delete(startIndexSlice, endIndexSlice);
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
