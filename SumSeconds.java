import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(scan.nextLine());
        int secondPlayer = Integer.parseInt(scan.nextLine());
        int thirdPlayer = Integer.parseInt(scan.nextLine());
        int sumTimeMinutes = (firstPlayer + secondPlayer + thirdPlayer) / 60;
        int sumTimeSeconds = (firstPlayer + secondPlayer + thirdPlayer) % 60;
        if (sumTimeSeconds > 10) {
            System.out.printf("%d:%d", sumTimeMinutes, sumTimeSeconds);
        } else {
            System.out.printf("%d:%02d", sumTimeMinutes, sumTimeSeconds);

        }
    }
}
