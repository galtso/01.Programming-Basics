import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        while (!destination.equals("End")) {
            double sumNeeded = Double.parseDouble(scan.nextLine());
            double collectedSum = 0;
            while (collectedSum < sumNeeded) {
                double moneyCollected = Double.parseDouble(scan.nextLine());
                collectedSum += moneyCollected;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scan.nextLine();
        }
    }
}
