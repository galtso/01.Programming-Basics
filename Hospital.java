import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int period = Integer.parseInt(scan.nextLine());
        int doctors = 7;
        int allTreated = 0;
        int allUntreated = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scan.nextLine());
            if (i % 3 == 0 && allUntreated > allTreated) {
                doctors++;
            }
            if (doctors >= patients) {
                allTreated += patients;
            } else {
                allTreated += doctors;
                allUntreated += (patients - doctors);

            }
        }
        System.out.printf("Treated patients: %d.%n", allTreated);
        System.out.printf("Untreated patients: %d.", allUntreated);
    }
}
