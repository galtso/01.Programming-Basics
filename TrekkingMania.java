import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGroups = Integer.parseInt(scan.nextLine());
        int sumOfPeople = 0;
        int musalaGroup = 0;
        int montblanGroup = 0;
        int kilimantjaroGroup = 0;
        int k2Group = 0;
        int everestGroup = 0;
        for (int i = 0; i < numberOfGroups; i++) {
            int numberOfPeopleInGroup = Integer.parseInt(scan.nextLine());
            sumOfPeople += numberOfPeopleInGroup;
            if (numberOfPeopleInGroup <= 5) {
                musalaGroup += numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <= 12) {
                montblanGroup += numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <= 25) {
                kilimantjaroGroup += numberOfPeopleInGroup;
            } else if (numberOfPeopleInGroup <= 40) {
                k2Group += numberOfPeopleInGroup;
            } else {
                everestGroup += numberOfPeopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", (1.0 * musalaGroup / sumOfPeople) * 100);
        System.out.printf("%.2f%%%n", 1.0 * montblanGroup / sumOfPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * kilimantjaroGroup / sumOfPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * k2Group / sumOfPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * everestGroup / sumOfPeople * 100);
    }
}
