import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());
        double electricityCost = 0;
        double waterCost = 0;
        double internetCost = 0;
        double others = 0;
        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            electricityCost += electricity;
            waterCost += 20;
            internetCost += 15;
            others += (electricity + 20 + 15) * 1.2;
        }
        System.out.printf("Electricity: %.2f lv%n", electricityCost);
        System.out.printf("Water: %.2f lv%n", waterCost);
        System.out.printf("Internet: %.2f lv%n", internetCost);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", (electricityCost + waterCost + internetCost + others) / months);
    }
}
