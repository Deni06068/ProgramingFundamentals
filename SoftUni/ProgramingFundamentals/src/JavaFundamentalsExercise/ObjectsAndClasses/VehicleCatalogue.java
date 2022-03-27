package JavaFundamentalsExercise.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1],  data[2], Integer.parseInt(data[3]));
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }
        for (Vehicle vehicle : vehicles){
            if (vehicle.type.equals("car")){
                vehicle.setType("Car");
            }else {
                vehicle.setType("Truck");
            }
        }
        String carInfo = scanner.nextLine();
        while (!carInfo.equals("Close the Catalogue")){
            String finalCarInfo = carInfo;
            vehicles.stream().filter(vehicle -> vehicle.model.equals(finalCarInfo)).forEach(System.out::println);
            carInfo = scanner.nextLine();
        }
        int carsHorsepower = 0;
        int cars = 0;
        int trucksHorsepower = 0;
        int trucks = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.type.equals("Car")) {
                carsHorsepower += vehicle.horsepower;
                cars++;
            }else {
                trucksHorsepower += vehicle.horsepower;
                trucks++;
            }
        }if (cars > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsHorsepower * 1.0 / cars);
        }else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (trucks > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksHorsepower * 1.0 / trucks);
        }else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.type, this.model, this.color, this.horsepower);
        }
    }
}
