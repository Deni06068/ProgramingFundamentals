package JavaFundamentalsExercise.DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        if (persons % capacity == 0){
            courses = persons / capacity;
            System.out.println(courses);
        }else {
            courses = persons / capacity;
            System.out.println(courses + 1);
        }
    }
}
