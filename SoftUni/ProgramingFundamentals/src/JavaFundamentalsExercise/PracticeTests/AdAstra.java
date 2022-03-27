package JavaFundamentalsExercise.PracticeTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> newInput = new ArrayList<>();
        List<Food> foods = new ArrayList<>();
        Pattern pattern = Pattern.compile("((?<divide>[#|])(?<food>[A-Za-z\\s*]+)\\2(?<date>\\d{2}/\\d{2}/\\d{2})\\2(?<calories>\\d+)\\2)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            Food food = new Food(matcher.group("food"), matcher.group("date"), Integer.parseInt(matcher.group("calories")));
            foods.add(food);
        }

        int calories = 0;
        for (Food value : foods) {
            calories = calories + value.calories;
        }

        int daysLast = calories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", daysLast);
        if (!foods.isEmpty()) {
            foods.forEach(food -> System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", food.name, food.date, food.calories));
        }
    }

    static class Food {
        String name;
        String date;
        int calories;


        public Food(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

    }
}
