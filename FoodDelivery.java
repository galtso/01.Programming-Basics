import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chickenMenuNumber = Integer.parseInt(scan.nextLine());
        int fishMenuNumber = Integer.parseInt(scan.nextLine());
        int veganMenuNumber = Integer.parseInt(scan.nextLine());
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        double sumOfMenus = chickenMenuNumber * 10.35 + fishMenuNumber * 12.4 + veganMenuNumber * 8.15;
        double dessert = sumOfMenus * 0.2;
        double moneyNeeded = sumOfMenus + dessert + 2.5;
        System.out.println(moneyNeeded);

    }
}
