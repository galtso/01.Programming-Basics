import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPagesInCurrentBook = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int numberOfDays = Integer.parseInt(scan.nextLine());

        int timeForCurrentBook = numberOfPagesInCurrentBook / pagesPerHour;
        int hoursPerDay = timeForCurrentBook / numberOfDays;

        System.out.println(hoursPerDay);
    }
}
