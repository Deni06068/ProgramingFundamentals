package JavaFundamentalsExercise.Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int blacklisted = 0;
        int lost = 0;



        while (!command.equals("Report")){
            String[] task = command.split(" ");
            switch (task[0]){
                case "Blacklist":
                    blacklisted = getBlacklistName(names, task, blacklisted);
                    break;
                case "Error":
                    lost = getErrorName(names, task, lost);
                    break;
                case "Change":
                    getChangeName(names, task);
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + blacklisted);
        System.out.println("Lost names: " + lost);

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");

        }


    }

    private static void getChangeName(List<String> names, String[] task) {
        int index = Integer.parseInt(task[1]);
        if (0 <= index && index < names.size()) {
            String currentName = names.get(index);
            names.set(index, task[2]);
            System.out.printf("%s changed his username to %s.%n", currentName, task[2]);
        }
    }

    private static int getErrorName(List<String> names, String[] task, int lost) {
        int index = Integer.parseInt(task[1]);

        if (0 <= index && index < names.size()){
            if (!names.get(index).equals("Blacklisted") && !names.get(index).equals("Lost")){
                System.out.printf("%s was lost due to an error.%n", names.get(index));
                names.set(index, "Lost");
                lost++;
            }
        }
        return lost;
    }

    private static int getBlacklistName(List<String> names, String[] task, int blacklisted) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(task[1])){
                System.out.printf("%s was blacklisted.%n", task[1]);
                names.set(i, "Blacklisted");
                blacklisted++;
                break;
            }else if (i == (names.size() - 1) && !names.get(i).equals(task[1])){
                System.out.printf("%s was not found.%n", task[1]);
            }
        }
            return blacklisted;
    }
}
