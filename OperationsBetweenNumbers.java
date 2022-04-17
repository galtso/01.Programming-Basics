import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        switch (operation) {
            case "+":
                int result = number1 + number2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", number1, operation, number2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", number1, operation, number2, result);
                }
                break;
            case "-":
                int result1 = number1 - number2;
                if (result1 % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", number1, operation, number2, result1);
                } else {
                    System.out.printf("%d %s %d = %d - odd", number1, operation, number2, result1);
                }
                break;
            case "*":
                int multiplication = number1 * number2;
                if (multiplication % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", number1, operation, number2, multiplication);
                } else {
                    System.out.printf("%d %s %d = %d - odd", number1, operation, number2, multiplication);
                }
                break;
            case "/":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    double division = 1.0 * number1 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, division);
                }
                break;
            case "%":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    int division2 = number1 % number2;
                    System.out.printf("%d %% %d = %d", number1, number2, division2);
                }
                break;
        }
    }
}
