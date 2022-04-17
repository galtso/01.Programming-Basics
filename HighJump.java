import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int desireJump = Integer.parseInt(scan.nextLine());
        int startPosition = desireJump - 30;
        int currentPosition = Integer.parseInt(scan.nextLine());
        int tryCount = 0;
        int jumpCount = 0;
        while (tryCount < 3) {
            if (startPosition < currentPosition) {
                jumpCount++;
            } else {
                startPosition += 5;
                tryCount++;
                jumpCount++;
            }
            currentPosition = Integer.parseInt(scan.nextLine());
        }

    }
}
