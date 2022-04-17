import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int numberOfFisherman = Integer.parseInt(scan.nextLine());
        double shipCost = 0;
        if (season.equals("Spring")) {
            shipCost = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            shipCost = 4200;
        } else if (season.equals("Winter")) {
            shipCost = 2600;
        }
        if (numberOfFisherman <= 6) {
            shipCost *= 0.9;
        } else if (numberOfFisherman >= 7 && numberOfFisherman <= 11) {
            shipCost *= 0.85;
        } else {
            shipCost *= 0.75;
        }
        if (numberOfFisherman % 2 == 0 && !season.equals("Autumn")) {
            shipCost *= 0.95;
        }
        if (budget >= shipCost) {
            System.out.printf("Yes! You have %.2f leva left.", budget - shipCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", shipCost - budget);
        }
    }
}
