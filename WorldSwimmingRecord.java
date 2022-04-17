import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distanceInMetres = Double.parseDouble(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());

        double timeForSwim = distanceInMetres * time;
        double delay = Math.floor(distanceInMetres / 15) * 12.5;
        timeForSwim += delay;
        if (timeForSwim >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeForSwim - record);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeForSwim);
        }
    }
}
