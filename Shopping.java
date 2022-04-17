import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int videoCards = Integer.parseInt(scan.nextLine());
        int cpus = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());
        double videoCardPrice = videoCards * 250;
        double cpuPrice = 0.35 * videoCardPrice * cpus;
        double ramPrice = 0.1 * videoCardPrice * ram;
        double sum = videoCardPrice + ramPrice + cpuPrice;
        if (videoCards > cpus) {
            sum = 0.85 * sum;
        }
        if (sum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
        }
    }
}
