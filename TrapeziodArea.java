import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double s = (a + b) * h / 2;
        System.out.printf("%.2f", s);
    }
}
