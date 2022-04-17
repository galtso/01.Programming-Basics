import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double change = Double.parseDouble(scan.nextLine());

        int countCoins = 0;
        change = Math.floor(change * 100);
        while (change > 0) {
            if (change >= 200) {
                change -= 200;
                countCoins++;
            } else if (change >= 100) {
                change -= 100;
                countCoins++;
            } else if (change >= 50) {
                change -= 50;
                countCoins++;
            } else if (change >= 20) {
                change -= 20;
                countCoins++;
            } else if (change >= 10) {
                change -= 10;
                countCoins++;
            } else if (change >= 5) {
                change -= 5;
                countCoins++;
            } else if (change >= 2) {
                change -= 2;
                countCoins++;
            } else if (change >= 1) {
                change -= 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}
