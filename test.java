import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int area = Integer.parseInt(scan.nextLine());
        double kgsGrapesPer1SqMeter = Double.parseDouble(scan.nextLine());
        int litersNeededForSale = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double areaForWine = area * 0.40;

        double grapesCollectedInKgs = areaForWine * kgsGrapesPer1SqMeter;
        double litersOfWine = grapesCollectedInKgs / 2.5;
        double wineLeft = litersOfWine - litersNeededForSale;
        double winePerWorker = wineLeft / workers;

        if (litersOfWine<litersNeededForSale) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineLeft));
        }else if (litersOfWine>=litersNeededForSale) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(litersOfWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(winePerWorker) );
        }
    }

}