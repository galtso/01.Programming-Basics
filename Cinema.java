import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double income = 0;
        int numberOfPeople = rows * columns;
        switch (projection) {
            case "Premiere":
                income = numberOfPeople * 12;
                break;
            case "Normal":
                income = numberOfPeople * 7.5;
                break;
            case "Discount":
                income = numberOfPeople * 5;
                break;
        }
        System.out.printf("%.2f%n", income);
        System.out.println("leva");
    }
}
