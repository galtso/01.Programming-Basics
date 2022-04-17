import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magnoliaNumber = Integer.parseInt(scan.nextLine());
        int hyacinthNumber = Integer.parseInt(scan.nextLine());
        int roseNumber = Integer.parseInt(scan.nextLine());
        int cactusNumber = Integer.parseInt(scan.nextLine());
        double moneyForPresentNeeded = Double.parseDouble(scan.nextLine());
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        double sumOfOrder = 0.95 * (3.25 * magnoliaNumber + 4 * hyacinthNumber + 3.5 * roseNumber + 8 * cactusNumber);

        if (sumOfOrder >= moneyForPresentNeeded) {
            System.out.printf("She is left with %.0f leva.", Math.floor(sumOfOrder - moneyForPresentNeeded));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyForPresentNeeded - sumOfOrder));
        }
    }
}
