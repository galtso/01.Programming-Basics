import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                for (int k = 1; k <= third; k++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        if (i % 2 == 0 && k % 2 == 0) {
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
    }
}
