import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2лв.
        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzleNumbers = Integer.parseInt(scan.nextLine());
        int dollNumbers = Integer.parseInt(scan.nextLine());
        int bearNumbers = Integer.parseInt(scan.nextLine());
        int minionNumbers = Integer.parseInt(scan.nextLine());
        int truckNumbers = Integer.parseInt(scan.nextLine());

        int toyNumbers = puzzleNumbers + dollNumbers + bearNumbers + minionNumbers + truckNumbers;
        double sumOfToyPrice = puzzleNumbers * 2.6 + dollNumbers * 3 + bearNumbers * 4.1 + minionNumbers * 8.2 + truckNumbers * 2;
        if (toyNumbers >= 50) {
            sumOfToyPrice = 0.75 * sumOfToyPrice;
        }
        double finalMoney = 0.9 * sumOfToyPrice;
        if (finalMoney >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", finalMoney - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - finalMoney);
        }
    }
}
