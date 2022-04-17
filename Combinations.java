import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 25; j++) {
                for (int k = 0; k <= 25; k++) {
                    if (i + j + k == n) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
