package Exercise.ForLoop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int topStudents = 0;
        int students4To5 = 0;
        int students3To4 = 0;
        int failStudents = 0;
        double sumGrade = 0.0;

        for (int i = 0; i < students; i++){
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrade = sumGrade + grade;

            if (grade >= 5.00){
                topStudents = topStudents + 1;
            }else if (grade >= 4.00){
                students4To5 = students4To5 + 1;
            }else if (grade >= 3.00){
                students3To4 = students3To4 + 1;
            }else{
                failStudents = failStudents + 1;
            }
        }
        double percentTopStudents = topStudents *1.0 / students * 100;
        double percentStudents4To5 = students4To5 * 1.0 / students * 100;
        double percentStudents3To4 = students3To4 * 1.0 / students * 100;
        double percentFailStudents = failStudents * 1.0 / students * 100;
        double averageGrade = sumGrade / students;

        System.out.printf("Top students: %.2f%%%n", percentTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentStudents4To5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentStudents3To4);
        System.out.printf("Fail: %.2f%%%n", percentFailStudents);
        System.out.printf("Average: %.2f%n", averageGrade);
    }
}
