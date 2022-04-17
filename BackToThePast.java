import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int deadEndYear = Integer.parseInt(scan.nextLine());
        double sumToLive = 0;
        int yearsOld = 17;

        for (int i = 1800; i <= deadEndYear; i++) {
            yearsOld++;
            if (i % 2 == 0) {
                sumToLive += 12000;
            } else {
                sumToLive += 12000 + (50 * yearsOld);
            }
        }
        if (money >= sumToLive) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money - sumToLive);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", sumToLive - money);
        }
    }
}
