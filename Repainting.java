import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        double sumOfMaterials = (nylon + 2) * 1.5 + 1.1 * paint * 14.5 + thinner * 5 + 0.4;
        double sumForRepair = hours * 0.3 * sumOfMaterials;
        System.out.println(sumForRepair + sumOfMaterials);
    }
}
