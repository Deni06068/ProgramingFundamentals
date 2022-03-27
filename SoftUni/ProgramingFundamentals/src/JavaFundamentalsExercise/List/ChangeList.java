package JavaFundamentalsExercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] command = line.split(" ");
            String operation = command[0];
            if (operation.equals("Delete")){
                int element = Integer.parseInt(command[1]);
                for (int i = 0; i < input.size(); i++) {
                    if (input.get(i) == element){
                        input.remove(i);
                        i--;
                    }
                }
            }else if (command[0].equals("Insert")){
                input.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }
            line = scanner.nextLine();
        }
        input.forEach(el -> System.out.print(el + " "));
    }
}
