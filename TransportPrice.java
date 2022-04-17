import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilometres = Integer.parseInt(scan.nextLine());
        String partOfDay = scan.nextLine();
        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус.Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20км.
        //•	Влак. Дневна / нощна тарифа:0.06лв. / км. Може да се използва за разстояния минимум 100км.
        double priceOfTransport = 0;
        if (kilometres >= 100) {
            priceOfTransport = kilometres * 0.06;
        } else if (kilometres >= 20) {
            priceOfTransport = kilometres * 0.09;
        } else {
            if (partOfDay.equals("day")) {
                priceOfTransport = kilometres * 0.79 + 0.7;
            } else if (partOfDay.equals("night")) {
                priceOfTransport = kilometres * 0.9 + 0.7;
            }
        }
        System.out.printf("%.2f", priceOfTransport);
    }
}
