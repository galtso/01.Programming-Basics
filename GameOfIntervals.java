import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int moves = Integer.parseInt(scan.nextLine());
        double startScore = 0;
        int secondRow = 0;
        int thirdRow = 0;
        int forthRow = 0;
        int fifthRow = 0;
        int sixthRow = 0;
        int seventhRow = 0;
        for (int i = 0; i < moves; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number >= 0 && number <= 9) {
                secondRow++;
                startScore += number * 0.2;
            } else if (number >= 10 && number <= 19) {
                thirdRow++;
                startScore += number * 0.3;
            } else if (number >= 20 && number <= 29) {
                forthRow++;
                startScore += number * 0.4;
            } else if (number >= 30 && number <= 39) {
                fifthRow++;
                startScore += 50;
            } else if (number >= 40 && number <= 50) {
                sixthRow++;
                startScore += 100;
            } else {
                seventhRow++;
                startScore /= 2;
            }
        }
        System.out.printf("%.2f%n", startScore);
        System.out.printf("From 0 to 9: %.2f%%%n", 1.0 * secondRow / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", 1.0 * thirdRow / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", 1.0 * forthRow / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", 1.0 * fifthRow / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", 1.0 * sixthRow / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%", 1.0 * seventhRow / moves * 100);
    }
}
