import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double truckValue = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        boolean isFull = false;
        while (!input.equals("End")) {
            double suitcaseSize = Double.parseDouble(input);
            if ((counter + 1) % 3 == 0) {
                truckValue -= (suitcaseSize * 1.1);
            } else {
                truckValue -= suitcaseSize;
            }
            if (0 > truckValue) {
                isFull = true;
                break;
            }


            counter++;
            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}