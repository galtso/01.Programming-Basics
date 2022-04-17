import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        //•	Ако числото е до 100включително, бонус точките са 5.
        //•	Ако числото е по-голямо от 100, бонус точките са 20%от числото.
        //•	Ако числото е по-голямо от 1000, бонус точките са 10%от числото.
        //
        //•	Допълнителни бонус точки (начисляват се отделно от предходните):
        //o	За четно число + 1 т.
        //o	За число, което завършва на 5+ 2 т.
        double bonusPoints = 0;
        if (a <= 100) {
            bonusPoints = 5;
        } else if (a > 1000) {
            bonusPoints = a * 0.1;
        } else {
            bonusPoints = 0.2 * a;
        }
        if (a % 2 == 0) {
            bonusPoints += 1;
        } else if (a % 10 == 5) {
            bonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.println(a + bonusPoints);
    }
}
