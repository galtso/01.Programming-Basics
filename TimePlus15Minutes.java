import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int newMinutes = minutes + 15;
        if (newMinutes > 59) {
            newMinutes -= 60;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        if (newMinutes < 10) {
            System.out.printf("%d:%02d", hour, newMinutes);
        } else {
            System.out.printf("%d:%d", hour, newMinutes);
        }
    }
}
