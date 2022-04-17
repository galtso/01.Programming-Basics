import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yardSize = Double.parseDouble(scan.nextLine());
        double finalPrice = yardSize * 7.61;
        double discount = finalPrice * 0.18;
        double priceWithoutDiscount = finalPrice - discount;

        System.out.printf("The final price is: %.2f lv.%n", priceWithoutDiscount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
