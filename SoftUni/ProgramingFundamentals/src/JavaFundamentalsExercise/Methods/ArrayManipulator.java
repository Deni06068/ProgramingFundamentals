package JavaFundamentalsExercise.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("exchange")) {
                exchangeArray(array, command);
            } else if (command[0].equals("max") && command[1].equals("even")) {
                printMaxEven(array);
            } else if (command[0].equals("max") && command[1].equals("odd")) {
                printMaxOdd(array);
            } else if (command[0].equals("min") && command[1].equals("even")) {
                printMinEven(array);
            } else if (command[0].equals("min") && command[1].equals("odd")) {
                printMinOdd(array);
            } else if (command[0].equals("first") && command[2].equals("even")) {
                int count = Integer.parseInt(command[1]);
                printFirstEven(array, command);
            } else if (command[0].equals("first") && command[2].equals("odd")) {
                int count = Integer.parseInt(command[1]);
                printFirstOdd(array, command);
            } else if (command[0].equals("last") && command[2].equals("even")) {
                printLastEven(array, command);
            } else if (command[0].equals("last") && command[2].equals("odd")) {
                printLastOdd(array, command);
            }


            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));

    }

    private static void exchangeArray(int[] array, String[] command) {
        int exchange = Integer.parseInt(command[1]);
        if (exchange >= array.length || exchange < 0){
            System.out.println("Invalid index");
        }else {
            int[] a = Arrays.copyOfRange(array, 0, exchange + 1);
            int[] b = Arrays.copyOfRange(array, exchange + 1, array.length);
            for (int i = 0; i < array.length; i++) {
                if (i < b.length) {
                    array[i] = b[i];
                } else {
                    array[i] = a[i - b.length];
                }
            }
        }
    }

    private static void printLastOdd(int[] array, String[] command) {
        int count = Integer.parseInt(command[1]);
        int printed = 0;
        String print = "";
        if (count > array.length){
            System.out.println("Invalid count");
        }else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 1 && printed < count) {
                    printed++;
                    print = array[i] + " " + print;
                }
            }
            if (print.equals("")) {
                System.out.println("[]");
            } else {
                int[] arrayToPrint = Arrays.stream(print.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println(Arrays.toString(arrayToPrint));
            }
        }
    }

    private static void printLastEven(int[] array, String[] command) {
        int count = Integer.parseInt(command[1]);
        int printed = 0;
        String print = "";
        if (count > array.length){
            System.out.println("Invalid count");
        }else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0 && printed < count) {
                    printed++;
                    print = array[i] + " " + print;
                }
            }
            if (print.equals("")) {
                System.out.println("[]");
            } else {
                int[] arrayToPrint = Arrays.stream(print.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println(Arrays.toString(arrayToPrint));
            }
        }
    }

    private static void printFirstOdd(int[] array, String[] command) {
        int count = Integer.parseInt(command[1]);
        int printed = 0;
        String print = "";
        if (count > array.length){
            System.out.println("Invalid count");
        }else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 1 && printed < count) {
                    printed++;
                    print = print + array[i] + " ";
                }
            }
            if (print.equals("")) {
                System.out.println("[]");
            } else {
                int[] arrayToPrint = Arrays.stream(print.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println(Arrays.toString(arrayToPrint));
            }
        }
    }

    private static void printFirstEven(int[] array, String[] command) {
        int count = Integer.parseInt(command[1]);
        int printed = 0;
        String print = "";
        if (count > array.length){
            System.out.println("Invalid count");
        }else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && printed < count) {
                    printed++;
                    print = print + array[i] + " ";
                }
            }
            if (print.equals("")) {
                System.out.println("[]");
            } else {
                int[] arrayToPrint = Arrays.stream(print.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println(Arrays.toString(arrayToPrint));
            }
        }
    }

    private static void printMinOdd(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (minOdd >= array[i] && array[i] % 2 == 1) {
                minOdd = array[i];
                index = i;
            }
        }
        if (minOdd >= Integer.MAX_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMinEven(int[] array) {
        int minEven = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (minEven >= array[i] && array[i] % 2 == 0) {
                minEven = array[i];
                index = i;
            }
        }
        if (minEven >= Integer.MAX_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMaxOdd(int[] array) {
        int maxOdd = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxOdd <= array[i] && array[i] % 2 == 1) {
                maxOdd = array[i];
                index = i;
            }
        }
        if (maxOdd <= Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMaxEven(int[] array) {
        int maxEven = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxEven <= array[i] && array[i] % 2 == 0) {
                maxEven = array[i];
                index = i;
            }
        }
        if (maxEven <= Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }
}
