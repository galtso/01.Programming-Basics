import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scan.nextLine());
        int P1 = Integer.parseInt(scan.nextLine());
        int P2 = Integer.parseInt(scan.nextLine());
        double hoursMissing = Double.parseDouble(scan.nextLine());

        double pipe1Litres = P1 * hoursMissing;
        double pipe2Litres = P2 * hoursMissing;
        double sumLitres = pipe1Litres + pipe2Litres;
        if (sumLitres <= poolVolume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", (sumLitres / poolVolume * 100), pipe1Litres / sumLitres * 100, pipe2Litres / sumLitres * 100);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursMissing, sumLitres - poolVolume);
        }
    }
}
