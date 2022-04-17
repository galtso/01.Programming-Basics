import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > biggestNumber) {
                biggestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        System.out.println("Max number: " + biggestNumber);
        System.out.println("Min number: " + smallestNumber);
    }
}
