import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stadium = Integer.parseInt(scan.nextLine());
        int fensNumber = Integer.parseInt(scan.nextLine());
        double teamAFens = 0;
        double teamBFens = 0;
        double teamVFens = 0;
        double teamGFens = 0;
        for (int i = 0; i < fensNumber; i++) {
            String fanSector = scan.nextLine();
            if (fanSector.equals("A")) {
                teamAFens++;
            } else if (fanSector.equals("B")) {
                teamBFens++;
            } else if (fanSector.equals("V")) {
                teamVFens++;
            } else if (fanSector.equals("G")) {
                teamGFens++;
            }
        }
        double allFensPercent = (teamAFens + teamBFens + teamVFens + teamGFens) / stadium * 100;
        System.out.printf("%.2f%%%n", teamAFens / fensNumber * 100);
        System.out.printf("%.2f%%%n", teamBFens / fensNumber * 100);
        System.out.printf("%.2f%%%n", teamVFens / fensNumber * 100);
        System.out.printf("%.2f%%%n", teamGFens / fensNumber * 100);
        System.out.printf("%.2f%%", allFensPercent);
    }
}
