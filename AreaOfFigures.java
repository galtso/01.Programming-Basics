import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double s = 0;
        switch (figure) {
            case "square":
                double a = Double.parseDouble(scan.nextLine());
                s = a * a;
                break;
            case "rectangle":
                double b = Double.parseDouble(scan.nextLine());
                double c = Double.parseDouble(scan.nextLine());
                s = b * c;
                break;
            case "circle":
                double r = Double.parseDouble(scan.nextLine());
                s = Math.PI * r * r;
                break;
            case "triangle":
                double d = Double.parseDouble(scan.nextLine());
                double hD = Double.parseDouble(scan.nextLine());
                s = d * hD / 2;
                break;
        }
        System.out.printf("%.3f", s);
    }
}
