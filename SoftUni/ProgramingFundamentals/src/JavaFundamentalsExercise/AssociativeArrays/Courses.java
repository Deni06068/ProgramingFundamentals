package JavaFundamentalsExercise.AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> list = new LinkedHashMap<>();

        while (!input.equals("end")){
            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];
            if (!list.containsKey(course)){
                list.put(course, new ArrayList<>());
            }
            list.get(course).add(name);
            input = scanner.nextLine();
        }

        list.forEach((key, value) -> {
            System.out.println(key + ": " + list.get(key).size());
            list.get(key).stream().forEach(s -> System.out.println("-- " + s));
        });
    }
}
