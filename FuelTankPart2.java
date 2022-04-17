import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuelType = scan.nextLine();
        double fuelQuantity = Double.parseDouble(scan.nextLine());
        String clubCard = scan.nextLine();
        double fuelPrice = 0;

        switch (fuelType) {
            case "Gas":
                if (clubCard.equals("Yes")) {
                    fuelPrice = fuelQuantity * 0.85;
                } else {
                    fuelPrice = fuelQuantity * 0.93;
                }
                break;
            case "Gasoline":
                if (clubCard.equals("Yes")) {
                    fuelPrice = fuelQuantity * 2.04;
                } else {
                    fuelPrice = fuelQuantity * 2.22;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    fuelPrice = fuelQuantity * 2.21;
                } else {
                    fuelPrice = fuelQuantity * 2.33;
                }
                break;
        }
        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            fuelPrice *= 0.92;
        } else if (fuelQuantity > 25) {
            fuelPrice *= 0.9;
        }
        System.out.printf("%.2f lv.", fuelPrice);
    }
}
