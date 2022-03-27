package JavaFundamentalsExercise.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int years = Integer.parseInt(data[1]);
            Person person = new Person(name, years);
            people.add(person);
        }
        people.stream().filter(person -> person.yearsOld > 30).forEach(System.out::println);

    }

    static class Person {
        String name;
        int yearsOld;

        public Person(String name, int yearsOld) {
            this.name = name;
            this.yearsOld = yearsOld;
        }

        @Override
        public String toString() {
            return String.format("%s - %d",this.name, this.yearsOld);
        }
    }
}
