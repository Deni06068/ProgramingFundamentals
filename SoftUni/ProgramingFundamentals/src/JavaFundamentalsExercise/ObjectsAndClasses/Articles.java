package JavaFundamentalsExercise.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Article> dataList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] data = scanner.nextLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            dataList.add(article);
        }
        String format = scanner.nextLine();
        switch (format){
            case "title":
                dataList.stream().sorted((p1, p2) -> p1.title.compareTo(p2.title)).forEach(System.out::println);
                break;
            case "content":
                dataList.stream().sorted((p1, p2) -> p1.content.compareTo(p2.content)).forEach(System.out::println);
                break;
            case "author":
                dataList.stream().sorted((p1, p2) -> p1.author.compareTo(p2.author)).forEach(System.out::println);
                break;
        }

    }
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return getTitle() + " - " + getContent() + ": " + getAuthor();
        }
    }
}
