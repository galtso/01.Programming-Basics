import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int letter = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == 'a') {
                letter += 1;
            } else if (symbol == 'e') {
                letter += 2;
            } else if (symbol == 'i') {
                letter += 3;
            } else if (symbol == 'o') {
                letter += 4;
            } else if (symbol == 'u') {
                letter += 5;
            }
        }
        System.out.println(letter);
    }
}
