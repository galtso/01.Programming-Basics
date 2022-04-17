import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMinute = Integer.parseInt(scan.nextLine());
        int examTimeInMinutes = examHour * 60 + examMinute;
        int arriveTimeInMinutes = arriveHour * 60 + arriveMinute;
        if (arriveTimeInMinutes > examTimeInMinutes) {
            System.out.println("Late");
            int lateTime = (arriveTimeInMinutes - examTimeInMinutes);
            if (lateTime < 60) {
                System.out.printf("%d minutes after the start", lateTime);
            } else {
                int lateHour = lateTime / 60;
                int lateMinutes = lateTime % 60;
                System.out.printf("%d:%02d hours after the start", lateHour, lateMinutes);
            }
        } else if ((examTimeInMinutes - arriveTimeInMinutes) <= 30) {
            if (examTimeInMinutes == arriveTimeInMinutes) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", (examTimeInMinutes - arriveTimeInMinutes) % 60);
            }
        } else if ((examTimeInMinutes - arriveTimeInMinutes) > 30) {
            System.out.println("Early");
            int earlyTime = examTimeInMinutes - arriveTimeInMinutes;
            int earlyHour = earlyTime / 60;
            int earlyMinutes = earlyTime % 60;
            if (earlyTime > 59) {
                System.out.printf("%d:%02d hours before the start", earlyHour, earlyMinutes);
            } else {
                System.out.printf("%d minutes before the start", earlyMinutes);
            }
        }
    }
}
