package JavaFundamentalsExercise.PracticeTests;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.nextLine());
        Map<String, Plant> plants = new LinkedHashMap<>();
        for (int i = 0; i < numLines; i++) {
            String input = scanner.nextLine();
            String[] currentInfo = input.split("<->");
            if (plants.containsKey(currentInfo[0])) {
                Plant plant = plants.get(currentInfo[0]);
                plant.setRarity(Integer.parseInt(currentInfo[1]));
            } else {
                Plant plant = new Plant(currentInfo[0], Integer.parseInt(currentInfo[1]), new ArrayList<>());
                plants.put(currentInfo[0], plant);
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] command = input.split("\\s*:\\s* | \\s*-\\s*");
            switch (command[0]) {
                case "Rate":
                    if (plants.containsKey(command[1])) {
                        Plant plant = plants.get(command[1]);
                        plant.getRating().add(Integer.parseInt(command[2]));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    if (plants.containsKey(command[1])) {
                        Plant plant = plants.get(command[1]);
                        plant.setRarity(Integer.parseInt(command[2]));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if (plants.containsKey(command[1])) {
                        Plant plant = plants.get(command[1]);
                        plant.getRating().clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        plants.forEach((s, plant) -> {
            if(plant.getRating().isEmpty()){
                plant.getRating().add(0);
            }
        });
        System.out.println("Plants for the exhibition:");
        plants.forEach((key, value) -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", value.name, value.rarity, value.rating.stream().mapToDouble(a -> a).average().orElse(-1)));
    }

    static class Plant {
        String name;
        Integer rarity;
        List<Integer> rating;


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Integer getRarity() {
            return rarity;
        }


        public void setRarity(Integer rarity) {
            this.rarity = rarity;
        }

        public List<Integer> getRating() {
            return rating;
        }

        public Plant(String name, Integer rarity, List<Integer> rating) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;
        }
    }
}
