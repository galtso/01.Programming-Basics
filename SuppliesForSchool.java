import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int penPacketNumber = Integer.parseInt(scan.nextLine());
        int markerPacketNumber = Integer.parseInt(scan.nextLine());
        int litresCleanDetergent = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        double pensPrice = penPacketNumber * 5.8;
        double markerPrice = markerPacketNumber * 7.2;
        double detergentPrice = litresCleanDetergent * 1.2;
        double sum = pensPrice + markerPrice + detergentPrice;
        double sumWithoutDiscount = sum - (sum * discount / 100);

        System.out.println(sumWithoutDiscount);
    }
}
