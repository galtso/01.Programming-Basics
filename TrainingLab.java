import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double wInCentimetres = w * 100;
        double hInCentimetres = h * 100 - 100;
        int placesPerRow = (int) hInCentimetres / 70;
        int rows = (int) wInCentimetres / 120;
        int places = (placesPerRow * rows) - 3;
        System.out.println(places);

    }
}
