package JavaFundamentalsExercise.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");
        String input = scanner.nextLine();
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String name : names) {
            racers.putIfAbsent(name, 0);
        }
        while (!input.equals("end of race")) {
            Pattern name = Pattern.compile("(?<name>[A-Za-z]+)");
            Matcher matcherName = name.matcher(input);
            int distance = 0;
            Pattern digit = Pattern.compile("\\d");
            Matcher digitMatcher = digit.matcher(input);
            StringBuilder nameSB = new StringBuilder();
            while (matcherName.find()) {
                nameSB.append(matcherName.group());
            }
            while (digitMatcher.find()) {
                distance += Integer.parseInt(digitMatcher.group());
            }
            if (racers.containsKey(nameSB.toString())) {
                racers.put(nameSB.toString(), distance + racers.get(nameSB.toString()));
            }
            input = scanner.nextLine();
        }
        List<String>  sorted = new ArrayList<>();
        racers.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())).forEach(s -> sorted.add(s.getKey()));
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.printf("1st place: %s%n", sorted.get(i));
            }else if (i == 1){
                System.out.printf("2nd place: %s%n", sorted.get(i));
            }else {
                System.out.printf("3rd place: %s%n", sorted.get(i));
            }
        }
    }
}
