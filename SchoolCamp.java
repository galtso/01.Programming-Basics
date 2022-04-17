import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        String groupType = scan.nextLine();
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        int numberOfNights = Integer.parseInt(scan.nextLine());
        double price = 0;
        String sport = "";
        switch (season) {
            case "Winter":
                if (groupType.equals("girls")) {
                    sport = "Gymnastics";
                    price = numberOfNights * numberOfStudents * 9.6;
                } else if (groupType.equals("boys")) {
                    sport = "Judo";
                    price = numberOfNights * numberOfStudents * 9.6;
                } else {
                    sport = "Ski";
                    price = numberOfNights * numberOfStudents * 10;
                }
                break;
            case "Spring":
                if (groupType.equals("girls")) {
                    sport = "Athletics";
                    price = numberOfNights * numberOfStudents * 7.2;
                } else if (groupType.equals("boys")) {
                    sport = "Tennis";
                    price = numberOfNights * numberOfStudents * 7.2;
                } else {
                    sport = "Cycling";
                    price = numberOfNights * numberOfStudents * 9.5;
                }
                break;
            case "Summer":
                if (groupType.equals("girls")) {
                    sport = "Volleyball";
                    price = numberOfNights * numberOfStudents * 15;
                } else if (groupType.equals("boys")) {
                    sport = "Football";
                    price = numberOfNights * numberOfStudents * 15;
                } else {
                    sport = "Swimming";
                    price = numberOfNights * numberOfStudents * 20;
                }
                break;
        }
        if (numberOfStudents >= 10 && numberOfStudents < 20) {
            price *= 0.95;
        } else if (numberOfStudents >= 20 && numberOfStudents < 50) {
            price *= 0.85;
        } else if (numberOfStudents >= 50) {
            price *= 0.5;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
