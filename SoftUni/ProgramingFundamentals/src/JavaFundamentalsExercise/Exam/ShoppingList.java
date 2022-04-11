package JavaFundamentalsExercise.Exam;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("!");
        List<String> shoppingList = new ArrayList<>(Arrays.asList(input));

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")){
            String[] com = command.split(" ");
            String item = com[1];
            switch (com[0]){
                case "Urgent":
                    if (!shoppingList.contains(item)){
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    shoppingList.remove(item);
                    break;
                case "Correct":
                    if (shoppingList.contains(item)){
                        shoppingList.set(shoppingList.indexOf(item), com[2]);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
