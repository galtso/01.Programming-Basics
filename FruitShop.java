import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double ammount = Double.parseDouble(scan.nextLine());

        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) ||
                "Thursday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)) {
            if ("banana".equals(fruit)) {
                System.out.printf("%.2f", ammount * 2.5);
            } else if ("apple".equals(fruit)) {
                System.out.printf("%.2f", ammount * 1.2);
            } else if ("orange".equals(fruit)) {
                System.out.printf("%.2f", ammount * 0.85);
            } else if ("grapefruit".equals(fruit)) {
                System.out.printf("%.2f", ammount * 1.45);
            } else if ("kiwi".equals(fruit)) {
                System.out.printf("%.2f", ammount * 2.7);
            } else if ("pineapple".equals(fruit)) {
                System.out.printf("%.2f", ammount * 5.5);
            } else if ("grapes".equals(fruit)) {
                System.out.printf("%.2f", ammount * 3.85);
            } else {
                System.out.println("error");
            }
        } else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)) {
            if ("banana".equals(fruit)) {
                System.out.printf("%.2f", ammount * 2.7);
            } else if ("apple".equals(fruit)) {
                System.out.printf("%.2f", ammount * 1.25);
            } else if ("orange".equals(fruit)) {
                System.out.printf("%.2f", ammount * 0.9);
            } else if ("grapefruit".equals(fruit)) {
                System.out.printf("%.2f", ammount * 1.6);
            } else if ("kiwi".equals(fruit)) {
                System.out.printf("%.2f", ammount * 3);
            } else if ("pineapple".equals(fruit)) {
                System.out.printf("%.2f", ammount * 5.6);
            } else if ("grapes".equals(fruit)) {
                System.out.printf("%.2f", ammount * 4.2);
            }
        } else {
            System.out.println("error");
        }
    }
}


