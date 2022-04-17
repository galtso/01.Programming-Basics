import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String feedback = scan.nextLine();
        int nights = days - 1;
        double price = 0;
        switch (room) {
            case "room for one person":
                price = 18 * nights;
                break;
            case "apartment":
                price = 25 * nights;
                if (nights < 10) {
                    price *= 0.7;
                } else if (nights <= 15) {
                    price *= 0.65;
                } else {
                    price *= 0.5;
                }
                break;
            case "president apartment":
                price = 35 * nights;
                if (nights < 10) {
                    price *= 0.9;
                } else if (nights <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.8;
                }
                break;
        }
        if (feedback.equals("positive")) {
            price *= 1.25;
        } else if (feedback.equals("negative")) {
            price *= 0.9;
        }
        System.out.printf("%.2f", price);
    }
}
