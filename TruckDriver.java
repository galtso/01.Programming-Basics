import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double kmPerMonth = Double.parseDouble(scan.nextLine());
        double salary = 0;
        if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
            salary = kmPerMonth * 1.45 * 4;
        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                salary = kmPerMonth * 0.95 * 4;
            } else if (season.equals("Summer")) {
                salary = kmPerMonth * 1.1 * 4;
            } else {
                salary = kmPerMonth * 1.25 * 4;
            }
        } else if (kmPerMonth <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                salary = kmPerMonth * 0.75 * 4;
            } else if (season.equals("Summer")) {
                salary = kmPerMonth * 0.9 * 4;
            } else {
                salary = kmPerMonth * 1.05 * 4;
            }
        }
        System.out.printf("%.2f", salary * 0.9);
    }
}
