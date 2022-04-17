import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String weather = scan.nextLine();
        String outfit = "";
        String shoes = "";
        if (degrees >= 10 && degrees <= 18) {
            if (weather.equals("Afternoon") || weather.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (weather.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (weather.equals("Morning") || weather.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (weather.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (degrees >= 25) {
            if (weather.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (weather.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if (weather.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
