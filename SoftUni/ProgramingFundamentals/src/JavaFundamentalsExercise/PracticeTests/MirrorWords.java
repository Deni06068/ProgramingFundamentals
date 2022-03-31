package JavaFundamentalsExercise.PracticeTests;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("([@#])(?<word>[\\w]{3,})\\1");
        Matcher matcher = pattern.matcher(line);
        List<String> words = new ArrayList<>();
        Map<String, String> wordGroups = new LinkedHashMap<>();
        int countPairs = 0;

        while (matcher.find()) {
            words.add(matcher.group(2));
        }
        for (int i = 0; i < words.size() - 1; i++) {
            StringBuilder sb = new StringBuilder(words.get(i + 1));
            if (words.get(i).equalsIgnoreCase((sb.reverse().toString()))) {
                countPairs++;
                i++;
            }
        }
        for (int i = 0; i < words.size() - 1; i++) {
            StringBuilder sb = new StringBuilder(words.get(i + 1));
            if (words.get(i).equals(sb.reverse().toString())) {
                wordGroups.put(words.get(i), sb.reverse().toString());
                i++;
            }
        }
        words.forEach(System.out::println);
        System.out.println(countPairs);
        String mapAsString = wordGroups.keySet().stream()
                .map(key -> key + " <=> " + wordGroups.get(key))
                .collect(Collectors.joining(", "));
        System.out.println(mapAsString);
    }
}
