import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < tabs; i++) {

            String siteName = scan.nextLine();
            if ("Facebook".equals(siteName)) {
                salary -= 150;
            } else if ("Instagram".equals(siteName)) {
                salary -= 100;
            } else if ("Reddit".equals(siteName)) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.println(salary);
    }
}
