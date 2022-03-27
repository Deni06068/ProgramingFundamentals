package JavaFundamentalsExercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("End")){
            String[] data = line.split(" ");
            if (data[0].equals("Add")){
                numbers.add(Integer.parseInt(data[1]));
            }else if (data[0].equals("Insert")){
                if (Integer.parseInt(data[2])>=numbers.size() || Integer.parseInt(data[2]) < 0){
                    System.out.println("Invalid index");
                }else {
                    numbers.add(Integer.parseInt(data[2]), Integer.parseInt(data[1]));
                }
            }else if (data[0].equals("Remove")){
                if (Integer.parseInt(data[1])>=numbers.size() || Integer.parseInt(data[1]) < 0){
                    System.out.println("Invalid index");
                }else {
                    numbers.remove(Integer.parseInt(data[1]));
                }
            }else if (data[1].equals("left")){
                for (int i = 0; i < Integer.parseInt(data[2]); i++) {
                    numbers.add(numbers.get(0));
                    numbers.remove(numbers.get(0));
                }

            } else if (data[1].equals("right")){
                for (int i = 0; i < Integer.parseInt(data[2]); i++) {
                    numbers.add(0, numbers.get(numbers.size() - 1));
                    numbers.remove(numbers.size() - 1);
                }
            }
            line = scanner.nextLine();
        }
        numbers.forEach(el -> System.out.print(el + " "));
    }
}
