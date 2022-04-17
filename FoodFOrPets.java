import java.util.Scanner;

public class FoodFOrPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberDays = Integer.parseInt(scan.nextLine());
        double sumOfAllFood = Double.parseDouble(scan.nextLine());
        double sumOfEatenFood = 0;
        double sumOfDogFood = 0;
        double sumOfCatFood = 0;
        double sumOfBiscuits = 0;

        for (int i = 1; i <= numberDays; i++) {
            int dogEaten = Integer.parseInt(scan.nextLine());
            int catEaten = Integer.parseInt(scan.nextLine());
            sumOfDogFood += dogEaten;
            sumOfCatFood += catEaten;
            sumOfEatenFood += (dogEaten + catEaten);
            if (i % 3 == 0) {
                sumOfBiscuits += (dogEaten + catEaten) * 0.1;
            }
        }
        double eatenFoodP = sumOfEatenFood / sumOfAllFood * 100;
        double eatenDogP = sumOfDogFood / sumOfEatenFood * 100;
        double eatenCatP = sumOfCatFood / sumOfEatenFood * 100;
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(sumOfBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (eatenFoodP));
        System.out.printf("%.2f%% eaten from the dog.%n", (eatenDogP));
        System.out.printf("%.2f%% eaten from the cat.", (eatenCatP));
    }
}
