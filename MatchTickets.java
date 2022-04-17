import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double transport = 0;
        if (numberOfPeople >= 1 && numberOfPeople <= 4) {
            transport = 0.75 * budget;
        } else if (numberOfPeople >= 5 && numberOfPeople <= 9) {
            transport = 0.6 * budget;
        } else if (numberOfPeople >= 10 && numberOfPeople <= 24) {
            transport = 0.5 * budget;
        } else if (numberOfPeople >= 25 && numberOfPeople <= 49) {
            transport = 0.4 * budget;
        } else if (numberOfPeople >= 50) {
            transport = 0.25 * budget;
        }
        double moneyForTickets = 0;
        if (category.equals("VIP")) {
            moneyForTickets = numberOfPeople * 499.99;
        } else if (category.equals("Normal")) {
            moneyForTickets = numberOfPeople * 249.99;
        }
        double moneyNeeded = moneyForTickets + transport;
        if (moneyNeeded <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - moneyNeeded);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded - budget);
        }
    }
}
