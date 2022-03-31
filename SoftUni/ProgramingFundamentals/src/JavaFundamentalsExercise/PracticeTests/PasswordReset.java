package JavaFundamentalsExercise.PracticeTests;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        while (!line.equals("Done")){
            String[] command = line.split(" ");
            switch (command[0]){
                case "TakeOdd":
                    int i = 0;
                    int len = sb.length();
                    while(i<len)
                    {
                        sb.deleteCharAt(i);
                        i++;
                        len--;
                    }
                    System.out.println(sb);
                    break;
                case "Cut":
                    sb.delete(Integer.parseInt(command[1]), (Integer.parseInt(command[1]) + Integer.parseInt(command[2])));
                    System.out.println(sb);
                    break;
                case "Substitute":
                    boolean containing = false;
                    while (sb.toString().contains(command[1])){
                        sb.replace(sb.indexOf(command[1]), sb.indexOf(command[1]) + command[1].length(), command[2]);
                        containing = true;
                    }
                    if (!containing){
                        System.out.println("Nothing to replace!");
                    }else {
                        System.out.println(sb);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Your password is: " + sb);
    }
}
