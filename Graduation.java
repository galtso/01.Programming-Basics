import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double sum = 0;
        int failCount = 0;
        for (int i = 1; i <= 12; i++) {
            double currentGrade = Double.parseDouble(scan.nextLine());
            if (currentGrade < 4) {
                failCount++;
            }
            if (failCount > 1) {
                System.out.printf("%s has been excluded at %d grade", name, i-1);
                return;
            }
            sum += currentGrade;
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
    }
}
