package JavaFundamentalsExercise.PracticeTests;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(sb);
        String line = scanner.nextLine();
        while (!line.equals("Travel")) {
            String[] command = line.split(":\\s*");
            switch (command[0]) {
                case "Add Stop":
                    if (Integer.parseInt(command[1]) <= sb.length()) {
                        sb.insert(Integer.parseInt(command[1]), command[2]);
                        System.out.println(sb);
                    } else {
                        System.out.println(sb);
                    }
                    break;
                case "Remove Stop":
                    if (Integer.parseInt(command[1]) <= sb.length() && Integer.parseInt(command[2]) + 1 <= sb.length()) {
                        sb.delete(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1);
                        System.out.println(sb);
                    } else {
                        System.out.println(sb);
                    }
                    break;
                case "Switch":
                    if (sb.toString().contains(command[1])) {
                        int index = sb.indexOf(command[1]);
                        sb.delete(index, (index + command[1].length()));
                        sb.insert(index, command[2]);
                        System.out.println(sb);
                    } else {
                        System.out.println(sb);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + sb);
    }
}
