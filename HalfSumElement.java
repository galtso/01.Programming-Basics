import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            sum += currentNumber;
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        int sumWithoutMax = sum - maxNumber;
        if (maxNumber == sumWithoutMax) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumWithoutMax - maxNumber));
        }
    }
}
