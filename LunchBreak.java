import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tvShowName = scan.nextLine();
        int episodeLength = Integer.parseInt(scan.nextLine());
        int breakLength = Integer.parseInt(scan.nextLine());

        double lunchTime = 1.0 * breakLength / 8;
        double relaxTime = 1.0 * breakLength / 4;
        double timeLeft = breakLength - (lunchTime + relaxTime);
        if (episodeLength <= timeLeft) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", tvShowName, (int)Math.ceil(timeLeft - episodeLength));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", tvShowName, (int)Math.ceil(episodeLength - timeLeft));
        }
    }
}
