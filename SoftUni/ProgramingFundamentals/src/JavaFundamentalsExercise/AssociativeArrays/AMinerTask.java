package JavaFundamentalsExercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            resources.putIfAbsent(input, 0);
            resources.put(input, resources.get(input) + quantity);
            input = scanner.nextLine();
        }
        resources.forEach((key,value)->System.out.println(key +" -> "+value));
    }
}
