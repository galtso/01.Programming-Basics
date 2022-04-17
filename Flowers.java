import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberChrysanthemum = Integer.parseInt(scan.nextLine());
        int numberRoses = Integer.parseInt(scan.nextLine());
        int numberTulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String isHoliday = scan.nextLine();
        double bouquetPrice = 0;

        if ("Spring".equals(season) || "Summer".equals(season)) {
            bouquetPrice = ((numberChrysanthemum * 2) + (numberRoses * 4.1) + (numberTulips * 2.5));

        } else if ("Autumn".equals(season) || "Winter".equals(season)) {
            bouquetPrice = ((numberChrysanthemum * 3.75) + (numberRoses * 4.5) + (numberTulips * 4.15));

        }
        if (isHoliday.equals("Y")) {
            bouquetPrice *= 1.15;
        }
        if (season.equals("Spring") && numberTulips >= 7) {
            bouquetPrice *= 0.95;
        }
        if (season.equals("Winter") && numberRoses >= 10) {
            bouquetPrice *= 0.9;
        }
        if ((numberChrysanthemum + numberRoses + numberTulips) >= 20) {
            bouquetPrice *= 0.8;
        }
        System.out.printf("%.2f", bouquetPrice + 2);
    }
}
