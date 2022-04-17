import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());
        int depositTime = Integer.parseInt(scan.nextLine());
        double ayp = Double.parseDouble(scan.nextLine());
        double sum = deposit + depositTime * ((deposit * ayp / 100) / 12);
        System.out.println(sum);
    }
}
