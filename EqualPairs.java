import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pairs = Integer.parseInt(scan.nextLine());
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int value = firstNumber + secondNumber;
        int maxDiff = 0;
        for (int i = 1; i < pairs; i++) {
            firstNumber = Integer.parseInt(scan.nextLine());
            secondNumber = Integer.parseInt(scan.nextLine());
            if (Math.abs(value - (firstNumber + secondNumber)) > maxDiff) {
                maxDiff = Math.abs(value - (firstNumber + secondNumber));
                value = firstNumber + secondNumber;
            }
        }
        if (maxDiff != 0) {
            System.out.printf("No, maxdiff=%d", maxDiff);
        } else {
            System.out.printf("Yes, value=%d", value);
        }
    }
}
