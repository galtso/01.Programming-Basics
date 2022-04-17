import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int firstNumber = 0;
        int sum = 0;
        while (sum < n) {
            sum = 2 * firstNumber + 1;
            if (sum > n) {
                break;
            }
            System.out.println(sum);
            firstNumber = sum;

        }
    }
}
