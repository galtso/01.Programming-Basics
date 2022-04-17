import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            boolean isNonPrime = false;
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isNonPrime = true;
                    break;
                }
            }
            if (isNonPrime){
                nonPrimeSum+=number;
            }else {
                primeSum+=number;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}
