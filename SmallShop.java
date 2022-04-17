import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        switch (product) {
            case "coffee":
                switch (town) {
                    case "Sofia":
                        System.out.println(quantity * 0.5);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 0.4);
                        break;
                    case "Varna":
                        System.out.println(quantity * 0.45);
                        break;
                }
                break;
            case "water":
                switch (town) {
                    case "Sofia":
                        System.out.println(quantity * 0.8);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 0.7);
                        break;
                    case "Varna":
                        System.out.println(quantity * 0.7);
                        break;
                }
                break;
            case "beer":
                switch (town) {
                    case "Sofia":
                        System.out.println(quantity * 1.2);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 1.15);
                        break;
                    case "Varna":
                        System.out.println(quantity * 1.1);
                        break;
                }
                break;
            case "sweets":
                switch (town) {
                    case "Sofia":
                        System.out.println(quantity * 1.45);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 1.3);
                        break;
                    case "Varna":
                        System.out.println(quantity * 1.35);
                        break;
                }
                break;
            case "peanuts":
                switch (town) {
                    case "Sofia":
                        System.out.println(quantity * 1.6);
                        break;
                    case "Plovdiv":
                        System.out.println(quantity * 1.5);
                        break;
                    case "Varna":
                        System.out.println(quantity * 1.55);
                        break;
                }
                break;
        }
    }
}
