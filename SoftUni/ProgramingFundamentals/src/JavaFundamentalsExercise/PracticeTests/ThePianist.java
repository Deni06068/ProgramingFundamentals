package JavaFundamentalsExercise.PracticeTests;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, Piece> pieces = new LinkedHashMap<>();
        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("\\|");
            Piece piece = new Piece(input[1], input[2]);
            pieces.put(input[0], piece);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] com = command.split("\\|");
            String piece = com[1];
            switch (com[0]) {
                case "Add":
                    if (pieces.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    } else {
                        String composer = com[2];
                        String key = com[3];
                        Piece pieceToAdd = new Piece(composer, key);
                        pieces.put(piece, pieceToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, pieceToAdd.composer, pieceToAdd.key);
                    }
                    break;
                case "Remove":
                    if (pieces.containsKey(piece)) {
                        pieces.remove(piece);
                        System.out.println("Successfully removed " + piece + "!");
                    } else {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String newKey = com[2];
                    if (pieces.containsKey(piece)) {
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                        pieces.get(piece).setKey(newKey);
                    } else {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        pieces.forEach((s, piece) -> System.out.printf("%s -> Composer: %s, Key: %s%n", s, piece.composer, piece.key));


    }

    static class Piece {
        String composer;
        String key;

        public Piece(String composer, String key) {
            this.composer = composer;
            this.key = key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
}
