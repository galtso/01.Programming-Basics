import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < n; i++) {
            int firstNumber = Integer.parseInt(scan.nextLine());
            firstSum += firstNumber;

        }
        for (int i = 0; i < n; i++) {
            int secondNumber = Integer.parseInt(scan.nextLine());
            secondSum += secondNumber;
        }
        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", firstSum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(firstSum-secondSum));
        }
    }
}
