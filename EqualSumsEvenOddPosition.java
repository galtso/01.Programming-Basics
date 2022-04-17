import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNumber = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNumber.length(); j++) {
                int digit = Integer.parseInt("" + currentNumber.charAt(j));
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
