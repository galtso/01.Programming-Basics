import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakePieces = cakeLength * cakeWidth;
        String input = scan.nextLine();
        while (!input.equals("STOP")) {
            int takenPieces = Integer.parseInt(input);
            if (cakePieces < takenPieces) {
                System.out.printf("No more cake left! You need %d pieces more.", takenPieces - cakePieces);
                return;
            } else {
                cakePieces -= takenPieces;
            }
            input = scan.nextLine();
        }
        System.out.printf("%d pieces are left.", cakePieces);
    }
}
