import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int expectedSum = Integer.parseInt(scan.nextLine());
        int collectedSUm = 0;
        int countSales = 0;
        int cashCount = 0;
        int creditCardCount = 0;
        int cashSale = 0;
        int creditCardSale = 0;
        String input = scan.nextLine();
        while (!input.equals("End")) {
            int itemPrice = Integer.parseInt(input);
            countSales++;
            if (countSales % 2 != 0) {
                if (itemPrice <= 100) {
                    cashCount++;
                    cashSale += itemPrice;
                    collectedSUm += itemPrice;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (itemPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    creditCardCount++;
                    creditCardSale += itemPrice;
                    collectedSUm += itemPrice;
                    System.out.println("Product sold!");
                }
                if (collectedSUm >= expectedSum) {
                    System.out.printf("Average CS: %.2f%n", 1.0 * cashSale / cashCount);
                    System.out.printf("Average CC: %.2f", 1.0 * creditCardSale / creditCardCount);
                    return;
                }
            }
            input = scan.nextLine();
        }
        System.out.println("Failed to collect required money for charity.");
    }
}
