import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        System.out.println(usd * 1.79549);
    }
}
