import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mackerel = Double.parseDouble(scan.nextLine());
        double sprat = Double.parseDouble(scan.nextLine());
        double bonitoKg = Double.parseDouble(scan.nextLine());
        double horseMackerelKg = Double.parseDouble(scan.nextLine());
        int shellsKg = Integer.parseInt(scan.nextLine());

        //•	Паламуд – 60% по-скъп от скумрията
        //•	Сафрид – 80% по-скъп от цацата
        //•	Миди – 7.50 лв. за килограм

        double shellsPrice = shellsKg * 7.5;
        double bonitoPrice = 1.6 * mackerel * bonitoKg;
        double horseMackerelPrice = 1.8 * sprat * horseMackerelKg;
        double sum = shellsPrice + bonitoPrice + horseMackerelPrice;
        System.out.printf("%.2f", sum);
    }
}
