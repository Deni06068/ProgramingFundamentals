package Exercise.ConditionalStatemenst;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double litresP1 = P1 * H;
        double litresP2 = P2 * H;
        double litresInPool = Math.abs(litresP1 + litresP2);
        double difference = Math.abs(V - litresInPool);
        double percentFull = litresInPool / V * 100;
        double percentP1 = litresP1 / litresInPool * 100;
        double percentP2 = litresP2 / litresInPool * 100;

        if (litresInPool <= V){
            System.out.printf("The pool is %.2f%s full. Pipe 1: %.2f%s. Pipe 2: %.2f%s.", percentFull, "%", percentP1, "%", percentP2, "%");

        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, difference);
        }
    }
}
