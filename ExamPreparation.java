import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int badScore = Integer.parseInt(scan.nextLine());
        int allTask = 0;
        int badScoreCount = 0;
        int goodScoreCount = 0;
        double sumOfGrades = 0;
        String problemName = "";
        String input = scan.nextLine();
        while (!input.equals("Enough")) {
            double score = Double.parseDouble(scan.nextLine());
            allTask++;
            if (score <= 4) {
                badScoreCount++;
                if (badScoreCount == badScore) {
                    System.out.printf("You need a break, %d poor grades.", badScoreCount);
                    return;
                }else {
                    problemName = input;
                    goodScoreCount++;
                    sumOfGrades += score;
                }
            } else {
                problemName = input;
                goodScoreCount++;
                sumOfGrades += score;
            }
            input = scan.nextLine();
        }
        System.out.printf("Average score: %.2f%n", sumOfGrades / goodScoreCount);
        System.out.printf("Number of problems: %d%n", goodScoreCount);
        System.out.printf("Last problem: %s", problemName);
    }
}
