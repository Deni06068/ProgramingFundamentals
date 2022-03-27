package JavaFundamentalsExercise.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s++");
        List<Person> people = new ArrayList<>();

        while (!input[0].equals("End")){
            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            people.add(person);
            input = scanner.nextLine().split("\\s+");
        }
        people.stream().sorted((p1, p2) -> Integer.compare(p1.age, p2.age)).forEach(System.out::println);
    }
    static class Person{
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
        }
    }
}
