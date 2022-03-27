package JavaFundamentalsExercise.ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Message message = new Message();
        message.print(count);

    }

    static class Message {
        String[] phrase = new String[]{
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] event = new String[]{
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, " +
                        "I am very satisfied.",
                "I feel great!"};
        String[] author = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] city = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rnd = new Random();

        void print(int count) {
            for (int i = 0; i < count; i++) {
                System.out.printf("%s %s %s - %s.%n",
                        this.phrase[rnd.nextInt(phrase.length)],
                        this.event[rnd.nextInt(event.length)],
                        this.author[rnd.nextInt(author.length)],
                        this.city[rnd.nextInt(city.length)]);
            }
        }


    }
}
