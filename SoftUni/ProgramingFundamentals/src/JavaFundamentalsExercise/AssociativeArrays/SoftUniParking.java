package JavaFundamentalsExercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredUsers = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String username = input[1];
            switch (command){
                case "register":
                    String licensePlateNumber = input[2];
                    if (!registeredUsers.containsKey(username)){
                        registeredUsers.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }else {
                        System.out.printf("ERROR: already registered with plate number %s%n", registeredUsers.get(username));
                    }
                    break;
                case "unregister":
                    if (!registeredUsers.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n", username);
                    }else {
                        registeredUsers.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        registeredUsers.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
