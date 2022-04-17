import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFood = Integer.parseInt(scan.nextLine());
        int catFood = Integer.parseInt(scan.nextLine());
        double dogFoodPrice = dogFood * 2.5;
        double catFoodPrice = catFood * 4;

        System.out.printf("%.1f lv.", dogFoodPrice + catFoodPrice);
    }
}
