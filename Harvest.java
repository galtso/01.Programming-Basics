import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double totalGrape = x * y;
        double totalWine = 0.4 * totalGrape / 2.5;
        if (totalWine >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(totalWine));
            double wineLeft = totalWine - z;
            double winePerWorker = wineLeft / workers;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(winePerWorker));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z - totalWine));
        }
    }
}
