import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double s = Double.parseDouble(scan.nextLine());
        if (s < 0) {
            System.out.println("error");
            return;
        }
        switch (town) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                    s *= 0.05;
                } else if (s > 500 && s <= 1000) {
                    s *= 0.07;
                } else if (s > 1000 && s <= 10000) {
                    s *= 0.08;
                } else if (s > 10000) {
                    s *= 0.12;
                }
                break;
            case "Varna":
                if (s >= 0 && s <= 500) {
                    s *= 0.045;
                } else if (s > 500 && s <= 1000) {
                    s *= 0.075;
                } else if (s > 1000 && s <= 10000) {
                    s *= 0.1;
                } else if (s > 10000) {
                    s *= 0.13;
                }
                break;
            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    s *= 0.055;
                } else if (s > 500 && s <= 1000) {
                    s *= 0.08;
                } else if (s > 1000 && s <= 10000) {
                    s *= 0.12;
                } else if (s > 10000) {
                    s *= 0.145;
                }
                break;
            default:
                System.out.println("error");
                return;
        }
        System.out.printf("%.2f", s);
    }
}
