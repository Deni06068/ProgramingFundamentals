package Exercise.ForLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= period; i++){
            int patients = Integer.parseInt(scanner.nextLine());
            boolean doctorsHired = i % 3 == 0 && treatedPatients < untreatedPatients;
            if (doctorsHired) {
                doctors = doctors + 1;
            }
            if (patients <= doctors){
                treatedPatients = treatedPatients + patients;
            }else {
                treatedPatients = treatedPatients + doctors;
                untreatedPatients = untreatedPatients + (patients - doctors);
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
