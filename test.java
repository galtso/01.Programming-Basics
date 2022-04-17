import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());

        if (litres < 25) {
            System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
        }
        else   {
            if (fuel.equals("Diesel")) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else if (fuel.equals("Gasoline")) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else if (fuel.equals("Gas")) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else {
                System.out.println("Invalid fuel!");
            }

        }

    }
}
