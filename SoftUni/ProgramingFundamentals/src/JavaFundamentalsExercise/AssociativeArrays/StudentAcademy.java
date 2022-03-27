package JavaFundamentalsExercise.AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!students.containsKey(name))
                students.put(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        students.entrySet().stream().filter(s -> s.getValue().stream().mapToDouble(d -> d).average().orElse(0.0) >= 4.50).forEach(entry ->{
            double averageGrade = entry.getValue().stream().mapToDouble(x -> x).average().orElse(0.0);
            System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
        });
    }
}
