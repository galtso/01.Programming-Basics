import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goal = 10000;
        int sumOfSteps = 0;
        String input = scan.nextLine();
        while (!input.equals("Going home")) {
            int stepsWalked = Integer.parseInt(input);
            sumOfSteps += stepsWalked;
            if (sumOfSteps >= goal) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sumOfSteps - goal);
                return;
            }
            input = scan.nextLine();
        }
        int stepsAfter = Integer.parseInt(scan.nextLine());
        sumOfSteps += stepsAfter;
        if (sumOfSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumOfSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - sumOfSteps);
        }
    }
}
