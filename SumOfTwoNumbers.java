import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int combination = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                combination++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
    }
}
