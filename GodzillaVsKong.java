import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double clothesPrice = Double.parseDouble(scan.nextLine());
        double decor = 0.1 * budget;
        if (numberOfPeople > 150) {
            clothesPrice = 0.9 * clothesPrice;
        }
        double moneyCost = numberOfPeople * clothesPrice + decor;
        if (moneyCost <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - moneyCost);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyCost - budget);
        }
    }
}
