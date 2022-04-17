import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pricePerYear = Integer.parseInt(scan.nextLine());
        double shoes = 0.6 * pricePerYear;
        double outfit = 0.8 * shoes;
        double ball = outfit / 4;
        double accessories = ball / 5;
        double sum = pricePerYear + shoes + outfit + ball + accessories;
        System.out.println(sum);
    }
}
