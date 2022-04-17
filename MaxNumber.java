import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            if (currentNumber>maxNumber){
                maxNumber=currentNumber;
            }
            input = scan.nextLine();
        }
        System.out.println(maxNumber);
    }
}
