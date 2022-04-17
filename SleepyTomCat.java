import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int holidays = Integer.parseInt(scan.nextLine());
        int workDaysPlaytime = (365 - holidays) * 63;
        int holidaysPlaytime = holidays * 127;
        int yearPlaytime = workDaysPlaytime + holidaysPlaytime;
        if (yearPlaytime > 30000) {
            System.out.println("Tom will run away");
            int hoursLeft = (yearPlaytime - 30000) / 60;
            int minutesLeft = (yearPlaytime - 30000) % 60;
            System.out.printf("%d hours and %d minutes more for play", hoursLeft, minutesLeft);
        } else {
            System.out.println("Tom sleeps well");
            int hoursToSleep = (30000 - yearPlaytime) / 60;
            int minutesToSleep = (30000 - yearPlaytime) % 60;
            System.out.printf("%d hours and %d minutes less for play", hoursToSleep, minutesToSleep);
        }
    }
}
