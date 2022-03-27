package Lab.WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int clas = 1;
        double gradeSum = 0.0;
        int fail = 0;

        while (clas <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                fail++;
                if (fail < 2){
                    System.out.printf("%s has been excluded at %d grade", name, clas);
                    break;
                }
                continue;
            } else {
                gradeSum += grade;
                clas++;
            }
        }
        if (clas >= 12) {
            double average = gradeSum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
