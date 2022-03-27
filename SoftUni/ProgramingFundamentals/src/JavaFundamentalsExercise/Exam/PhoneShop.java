package JavaFundamentalsExercise.Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] task = command.split(" ");
            switch (task[0]){
                case "Add":
                    addNewPhoneToStorage(phones, task);
                    break;
                case "Remove":
                    removeNewPhoneFromStorage(phones, task);
                    break;
                case "Bonus":
                    addBonusPhoneToStorage(phones, task);
                    break;
                case "Last":
                    getLastPositionPhone(phones, task);
                    break;
            }




            command = scanner.nextLine();
        }
        for (int i = 0; i < phones.size(); i++) {
            if (i < phones.size() - 1) {
                System.out.print(phones.get(i) + ", ");
            }else {
                System.out.print(phones.get(i));
            }
        }

    }

    private static void getLastPositionPhone(List<String> phones, String[] task) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).equals(task[2])){
                phones.add(task[2]);
                phones.remove(i);
            }
        }
    }

    private static void addBonusPhoneToStorage(List<String> phones, String[] task) {
        String[] bonusPhones = task[3].split(":");
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).equals(bonusPhones[0])){
                phones.add(i + 1, bonusPhones[1]);
            }
        }

    }

    private static void removeNewPhoneFromStorage(List<String> phones, String[] task) {
        if (phones.contains(task[2])){
            phones.remove(task[2]);
        }
    }

    private static void addNewPhoneToStorage(List<String> phones, String[] task) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).equals(task[2])){
                break;
            }else if (i == phones.size() - 1 && !task[2].equals(phones.get(i))){
                phones.add(task[2]);
            }
        }
    }
}
