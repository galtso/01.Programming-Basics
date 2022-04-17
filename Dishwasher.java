import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int washBottles = Integer.parseInt(scan.nextLine());
        int washLitre = washBottles * 750;
        int count = 0;
        int countPlates = 0;
        int countPots = 0;
        String input = scan.nextLine();
        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            count++;
            if (count % 3 == 0) {
                washLitre -= dishes * 15;
                countPots += dishes;
            } else {
                washLitre -= dishes * 5;
                countPlates += dishes;
            }
            if (washLitre < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(washLitre));
                return;
            }
            input = scan.nextLine();
        }
        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n", countPlates, countPots);
        System.out.printf("Leftover detergent %d ml.", washLitre);
    }
}
