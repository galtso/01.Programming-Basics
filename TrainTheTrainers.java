import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judgeNumber = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double averagePresentationGrade = 0;
        double averageStudentGrade = 0;
        int count = 0;
        while (!input.equals("Finish")) {
            String presentationName = input;

            for (int i = 0; i < judgeNumber; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                averagePresentationGrade += grade;
                count++;
            }
            System.out.printf("%s - %.2f.%n", presentationName, averagePresentationGrade / judgeNumber);
            averageStudentGrade += averagePresentationGrade;
            averagePresentationGrade = 0;
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", averageStudentGrade / count);
    }
}
