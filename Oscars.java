import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actorName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int judgesNumber = Integer.parseInt(scan.nextLine());
        double actorResult = 0;
        for (int i = 0; i < judgesNumber; i++) {
            String judgeName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());
            actorResult = academyPoints + (judgeName.length() * judgePoints / 2);
            academyPoints = actorResult;
            if (actorResult >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, actorResult);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - actorResult));
    }
}
