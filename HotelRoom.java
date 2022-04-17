import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int numberOfDays = Integer.parseInt(scan.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        if ("May".equals(month) || "October".equals(month)) {
            studioPrice = numberOfDays * 50;
            apartmentPrice = numberOfDays * 65;
            if (numberOfDays > 7 && numberOfDays <= 14) {
                studioPrice *= 0.95;
            } else if (numberOfDays > 14) {
                studioPrice *= 0.7;
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            studioPrice = numberOfDays * 75.2;
            if (numberOfDays > 14) {
                studioPrice *= 0.8;
            }
            apartmentPrice = numberOfDays * 68.7;
        } else if ("July".equals(month) || "August".equals(month)) {
            studioPrice = numberOfDays * 76;
            apartmentPrice = numberOfDays * 77;
        }
        if (numberOfDays > 14) {
            apartmentPrice *= 0.9;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
