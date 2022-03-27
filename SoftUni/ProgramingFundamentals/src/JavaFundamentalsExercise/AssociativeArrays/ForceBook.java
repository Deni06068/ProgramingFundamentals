package JavaFundamentalsExercise.AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> sides = new LinkedHashMap<>();

        while (!line.equals("Lumpawaroo")) {
            if (line.contains("|")) {
                String[] input = line.split(" \\| ");
                String side = input[0];
                String name = input[1];

                sides.putIfAbsent(side, new ArrayList<>());
                if (!sides.get(side).contains(name)) {
                    sides.get(side).add(name);
                }
            }
            if (line.contains("->")) {
                String[] input = line.split(" -> ");
                String side = input[1];
                String name = input[0];
                sides.putIfAbsent(side, new ArrayList<>());
                sides.forEach((s, n) -> {
                    n.remove(name);
                });
                sides.get(side).add(name);
                System.out.println(name + " joins the " + side + " side!");
            }
            line = scanner.nextLine();
        }
        sides.forEach((key, value) -> {
            if (!value.isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", key, value.size());
                sides.get(key).stream().forEach(e -> System.out.println("! " + e));
            }
        });
    }
}
