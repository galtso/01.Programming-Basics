import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scan.nextLine());
        int foodLeft = Integer.parseInt(scan.nextLine());
        double dogFoodKg = Double.parseDouble(scan.nextLine());
        double catFoodKg = Double.parseDouble(scan.nextLine());
        double turtleFoodG = Double.parseDouble(scan.nextLine());
        double sumOfAllFood = (dogFoodKg + catFoodKg + turtleFoodG / 1000) * numberOfDays;

        if (foodLeft >= sumOfAllFood) {
            double restOfFood = Math.floor(foodLeft - sumOfAllFood);
            System.out.printf("%.0f kilos of food left.", restOfFood);
        } else {
            double foodNeeded = Math.ceil(sumOfAllFood - foodLeft);
            System.out.printf("%.0f more kilos of food are needed.", foodNeeded);
        }
    }
}
