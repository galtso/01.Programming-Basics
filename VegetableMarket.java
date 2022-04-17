import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vegetablesKgPrice = Double.parseDouble(scan.nextLine());
        double fruitKgPrice = Double.parseDouble(scan.nextLine());
        int vegetableWeight = Integer.parseInt(scan.nextLine());
        int fruitWeight = Integer.parseInt(scan.nextLine());
        double sum = ((vegetablesKgPrice * vegetableWeight) + (fruitKgPrice * fruitWeight)) / 1.94;

        System.out.printf("%.2f", sum);
    }
}
