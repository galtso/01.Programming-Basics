import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCargos = Integer.parseInt(scan.nextLine());
        int minibusPrice = 0;
        int minibusCargo = 0;
        int truckPrice = 0;
        int truckCargo = 0;
        int trainPrice = 0;
        int trainCargo = 0;
        int allCargo = 0;
        for (int i = 0; i < numberOfCargos; i++) {
            int cargoWeigh = Integer.parseInt(scan.nextLine());
            allCargo += cargoWeigh;
            if (cargoWeigh <= 3) {
                minibusPrice += cargoWeigh * 200;
                minibusCargo += cargoWeigh;
            } else if (cargoWeigh <= 11) {
                truckPrice += cargoWeigh * 175;
                truckCargo += cargoWeigh;
            } else {
                trainPrice += cargoWeigh * 120;
                trainCargo += cargoWeigh;
            }
        }
        System.out.printf("%.2f%n", 1.0 * (minibusPrice + truckPrice + trainPrice) / allCargo);
        System.out.printf("%.2f%%%n", 1.0 * minibusCargo / allCargo * 100);
        System.out.printf("%.2f%%%n", 1.0 * truckCargo / allCargo * 100);
        System.out.printf("%.2f%%", 1.0 * trainCargo / allCargo * 100);
    }
}
