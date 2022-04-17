import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double frontWalls = (x * x * 2) - (1.2 * 2);
        double sideWalls = 2 * x * y - 2 * 1.5 * 1.5;
        double sideRoofWalls = 2 * x * y;
        double triangleRoofWalls = x * h;
        double wallsCost = (frontWalls + sideWalls) / 3.4;
        double roofCost = (sideRoofWalls + triangleRoofWalls) / 4.3;
        System.out.printf("%.2f", wallsCost);
        System.out.println();
        System.out.printf("%.2f", roofCost);
    }
}
