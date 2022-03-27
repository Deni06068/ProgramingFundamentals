package JavaFundamentalsExercise.PracticeTests;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        List<Character> message;
        message = encryptedMessage.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("Decode")) {
            String[] command = line.split("\\|");
            switch (command[0]) {
                case "Move":
                    moveCommand(command, message);
                    break;
                case "Insert":
                    insertCommand(command, message);
                    break;
                case "ChangeAll":
                    changeAll(command, message);
                    break;
            }
            line = scanner.nextLine();
        }
        StringBuilder sb = new StringBuilder();
        message.forEach(sb::append);
        String finalMessage = sb.toString();
        System.out.printf("The decrypted message is: %s", finalMessage);

    }

    static void moveCommand(String[] command, List<Character> message) {
        for (int i = 0; i < Integer.parseInt(command[1]); i++) {
            message.add(message.get(0));
            message.remove(0);
        }
    }

    static void insertCommand(String[] command, List<Character> message) {
        int index = Integer.parseInt(command[1]);
        for (int i = 0; i < command[2].length(); i++) {
            char addChar = command[2].charAt(i);
            if (message.size() - 1 > index) {
                message.add(index + i, addChar);
            }else if (message.size() - 1 <= index){
                message.add(addChar);
            }
        }
    }

    static void changeAll(String[] command, List<Character> message) {
        char change = command[1].charAt(0);
        char newChar = command[2].charAt(0);
        for (int i = 0; i < message.size(); i++) {
            if (message.get(i).equals(change)) {
                message.set(i, newChar);
            }
        }
    }
}
