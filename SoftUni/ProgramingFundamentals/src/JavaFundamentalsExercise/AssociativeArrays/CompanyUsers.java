package JavaFundamentalsExercise.AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> list = new LinkedHashMap<>();

        while (!line.equals("End")){
            String[] input = line.split(" -> ");
            String company = input[0];
            String employeeID = input[1];
            if (!list.containsKey(company)){
                list.put(company, new ArrayList<>());
            }
            if (!list.get(company).contains(employeeID)) {
                list.get(company).add(employeeID);
            }
            line = scanner.nextLine();
        }
        list.forEach((key, value) -> {
            System.out.println(key);
            list.get(key).stream().forEach(e -> System.out.println("-- " + e));
        } );
    }
}
