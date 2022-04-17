import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (sum < number) {
            int input = Integer.parseInt(scan.nextLine());
            sum += input;
        }
        System.out.println(sum);
    }
}
