import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuelType = scan.nextLine();
        double fuelInTank = Double.parseDouble(scan.nextLine());
        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            if (fuelInTank >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        }else {
            System.out.println("Invalid fuel!");
        }
    }
}
