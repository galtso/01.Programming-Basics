import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washMachinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        int sumMoney = 0;
        int sumToys = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                sumToys++;
            } else {
                sumMoney += (i * 10 / 2) - 1;
            }
        }
        int moneyFromToys = sumToys * toyPrice;
        sumMoney += moneyFromToys;
        if (sumMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", sumMoney - washMachinePrice);
        } else {
            System.out.printf("No! %.2f", washMachinePrice - sumMoney);
        }
    }
}
