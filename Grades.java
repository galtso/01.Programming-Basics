import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double poorGrade = 0;  // <3
        double middleGrade = 0;  // 3-3.99
        double goodGrade = 0;  //4-4.99
        double excellentGrade = 0;   // 5+
        double averageGrade = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            averageGrade += grade;
            if (grade <= 2.99) {
                poorGrade++;
            } else if (grade <= 3.99) {
                middleGrade++;
            } else if (grade <= 4.99) {
                goodGrade++;
            } else {
                excellentGrade++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", excellentGrade / numberOfStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodGrade / numberOfStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", middleGrade / numberOfStudents * 100);
        System.out.printf("Fail: %.2f%%%n", poorGrade / numberOfStudents * 100);
        System.out.printf("Average: %.2f", averageGrade / numberOfStudents);
    }
}
