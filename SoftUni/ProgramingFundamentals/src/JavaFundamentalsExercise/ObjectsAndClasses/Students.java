package JavaFundamentalsExercise.ObjectsAndClasses;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            students.add(student);
        }
        students.stream().sorted((s1, s2) ->Double.compare(s2.grade, s1.grade)).forEach(System.out::println);
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}
