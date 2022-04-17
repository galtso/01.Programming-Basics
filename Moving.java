import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roomLength = Integer.parseInt(scan.nextLine());
        int roomWidth = Integer.parseInt(scan.nextLine());
        int roomHeight = Integer.parseInt(scan.nextLine());
        int roomSize = roomLength * roomWidth * roomHeight;
        String input = scan.nextLine();
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            if (roomSize < boxes) {
                System.out.printf("No more free space! You need %d Cubic meters more.", boxes - roomSize);
                return;
            } else {
                roomSize -= boxes;
            }
            input = scan.nextLine();
        }
        System.out.printf("%d Cubic meters left.", roomSize);
    }
}
