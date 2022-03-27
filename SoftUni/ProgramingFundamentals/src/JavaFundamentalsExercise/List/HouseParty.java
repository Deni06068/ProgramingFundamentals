package JavaFundamentalsExercise.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");
            String name = data[0];
            if (!line.contains("not")){
                if (guests.contains(name)){
                    System.out.println(name + " is already in the list!");
                }else {
                    guests.add(name);
                }
            }else {
                if (guests.contains(name)){
                    guests.remove(name);
                }else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        guests.forEach(System.out::println);
    }
}
