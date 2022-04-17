import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold

        double degrees = Double.parseDouble(scan.nextLine());
        if (degrees >= 5 && degrees < 12) {
            System.out.println("Cold");
        } else if (degrees >= 12 && degrees < 15) {
            System.out.println("Cool");
        } else if (degrees >= 15 && degrees < 20.1) {
            System.out.println("Mild");
        } else if (degrees >= 20.1 && degrees < 26) {
            System.out.println("Warm");
        } else if (degrees >= 26 && degrees <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
