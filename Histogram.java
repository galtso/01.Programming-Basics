import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;
        double countP4 = 0;
        double countP5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number <= 199) {
                countP1++;
            } else if (number >= 200 && number < 400) {
                countP2++;
            } else if (number >= 400 && number < 600) {
                countP3++;
            } else if (number >= 600 && number < 800) {
                countP4++;
            } else {
                countP5++;
            }
        }
        System.out.printf("%.2f%%%n", countP1 / n * 100);
        System.out.printf("%.2f%%%n", countP2 / n * 100);
        System.out.printf("%.2f%%%n", countP3 / n * 100);
        System.out.printf("%.2f%%%n", countP4 / n * 100);
        System.out.printf("%.2f%%%n", countP5 / n * 100);
    }
}
