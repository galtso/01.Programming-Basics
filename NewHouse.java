import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flower = scan.nextLine();
        int numberOfFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        double sum = 0;
        switch (flower) {
            case "Roses":
                sum = numberOfFlowers * 5;
                if (numberOfFlowers > 80) {
                    sum *= 0.9;
                }
                break;
            case "Dahlias":
                sum = numberOfFlowers * 3.8;
                if (numberOfFlowers > 90) {
                    sum *= 0.85;
                }
                break;
            case "Tulips":
                sum = numberOfFlowers * 2.8;
                if (numberOfFlowers > 80) {
                    sum *= 0.85;
                }
                break;
            case "Narcissus":
                sum = numberOfFlowers * 3;
                if (numberOfFlowers < 120) {
                    sum *= 1.15;
                }
                break;
            case "Gladiolus":
                sum = numberOfFlowers * 2.5;
                if (numberOfFlowers < 80) {
                    sum *= 1.2;
                }
                break;
        }
        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flower, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}
