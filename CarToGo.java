import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String carClass = "";
        String carType = "";
        double carPrice = 0;
        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 0.35;
            } else {
                carType = "Jeep";
                carPrice = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 0.45;
            } else {
                carType = "Jeep";
                carPrice = budget * 0.8;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budget * 0.9;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
