package JavaFundamentalsExercise.List;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> output = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i--) {
            String[] numbers = input.get(i).split("\\s+");
            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].equals("")){
                    output.add(numbers[j]);
                }
            }
        }
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}
