import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyForTrip = Double.parseDouble(scan.nextLine());
        double availableMoney = Double.parseDouble(scan.nextLine());
        int countDays = 0;
        int countSpend = 0;
        while (availableMoney < moneyForTrip && countSpend < 5) {
            String input = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            if (input.equals("spend")) {
                countSpend++;
                if (sum >= availableMoney) {
                    availableMoney = 0;
                } else {
                    availableMoney -= sum;
                }
            }
            if (input.equals("save")) {
                availableMoney += sum;
                countSpend = 0;
            }
            countDays++;
        }
        if (countSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
