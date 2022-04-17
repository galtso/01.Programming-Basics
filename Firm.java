import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scan.nextLine());
        int daysForProject = Integer.parseInt(scan.nextLine());
        int numberOfOvertimeWorkers = Integer.parseInt(scan.nextLine());

        double hoursForProject = 0.9 * daysForProject * 8;
        double extraHoursWork = numberOfOvertimeWorkers * 2 * daysForProject;
        double sumOfHoursWork = Math.floor(hoursForProject + extraHoursWork);
        if (sumOfHoursWork >= hoursNeeded) {
            System.out.printf("Yes!%.0f hours left.", sumOfHoursWork - hoursNeeded);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursNeeded - sumOfHoursWork);
        }
    }
}
