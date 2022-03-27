package JavaFundamentalsExercise.ObjectsAndClasses;

import java.sql.Struct;
import java.util.*;

public class CompanyRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        Map<String, List<Employee>> employeesByDepartment = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 6) {
                Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4], Integer.parseInt(input[5]));
                employees.add(employee);
            } else if (input.length == 5) {
                Employee employee;
                if (input[4].contains("@")) {
                    employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4], -1);
                } else {
                    employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], "n/a", Integer.parseInt(input[4]));
                }
                employees.add(employee);
            } else {
                Employee employee = new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], "n/a", -1);
                employees.add(employee);
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            if (!employeesByDepartment.containsKey(employees.get(i).department)) {
                employeesByDepartment.put(employees.get(i).department, new ArrayList<>());
            }
            employeesByDepartment.get(employees.get(i).department).add(employees.get(i));
        }
        int maxSalary = 0;
        String departmentWithMaxSalary = "";
        for (Map.Entry<String, List<Employee>> entry : employeesByDepartment.entrySet()) {
            int currentMaxSalary = 0;
            String currentDepartment = "";
            for (int j = 0; j < employeesByDepartment.get(entry.getKey()).size(); j++) {
                currentMaxSalary += employeesByDepartment.get(entry.getKey()).get(j).salary;
                currentDepartment = entry.getKey();
            }
            if (currentMaxSalary > maxSalary) {
                maxSalary = currentMaxSalary;
                departmentWithMaxSalary = currentDepartment;
            }
        }
        System.out.printf("Highest Average salary: %s%n", departmentWithMaxSalary);
        for (int i = 0; i < employeesByDepartment.get(departmentWithMaxSalary).size(); i++) {
            System.out.println(employeesByDepartment.get(departmentWithMaxSalary).get(i));
        }


    }

    static class Department {

        String department;
        List<Employee> employeesByDepartment;

        public Department(String department, Employee data) {
            this.department = department;
            this.employeesByDepartment.add(data);
        }
    }

    static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
        }
    }
}
