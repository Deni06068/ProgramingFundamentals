package JavaFundamentalsExercise.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombNumberAndPower = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber = bombNumberAndPower.get(0);
        int power = bombNumberAndPower.get(1);
        while (numbers.contains(bombNumber)) {
            int bombIndex = numbers.indexOf(bombNumber);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0){
                start = 0;
            }
            if (end >= numbers.size()){
                end = numbers.size() - 1;
            }
            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println(sum);
    }
}
