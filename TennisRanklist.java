import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberTournaments = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());
        int averagePoints = 0;
        int wins = 0;
        for (int i = 0; i < numberTournaments; i++) {
            String position = scan.nextLine();
            if (position.equals("W")) {
                startPoints += 2000;
                averagePoints += 2000;
                wins++;
            } else if (position.equals("F")) {
                startPoints += 1200;
                averagePoints += 1200;
            } else if (position.equals("SF")) {
                startPoints += 720;
                averagePoints += 720;
            }
        }
        System.out.printf("Final points: %d%n", startPoints);
        System.out.printf("Average points: %d%n", averagePoints / numberTournaments);
        System.out.printf("%.2f%%", 1.0 * wins / numberTournaments * 100);
    }
}
