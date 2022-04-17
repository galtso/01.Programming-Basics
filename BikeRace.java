import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniorBikers = Integer.parseInt(scan.nextLine());
        int seniorBikers = Integer.parseInt(scan.nextLine());
        String trace = scan.nextLine();
        double bikersTax = 0;
        switch (trace) {
            case "trail":
                bikersTax = (juniorBikers * 5.5) + (seniorBikers * 7);
                break;
            case "cross-country":
                bikersTax = (juniorBikers * 8) + (seniorBikers * 9.5);
                if ((juniorBikers + seniorBikers) >= 50) {
                    bikersTax *= 0.75;
                }
                break;
            case "downhill":
                bikersTax = (juniorBikers * 12.25) + (seniorBikers * 13.75);
                break;
            case "road":
                bikersTax = (juniorBikers * 20) + (seniorBikers * 21.5);
                break;
        }
        double sum = bikersTax * 0.95;
        System.out.printf("%.2f", sum);
    }
}
