import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favoriteBook = scan.nextLine();
        String currentBook = scan.nextLine();
        int counter = 0;
        while (!currentBook.equals(favoriteBook)) {
            if (currentBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", counter);
                return;
            }
            counter++;
            currentBook = scan.nextLine();
        }
        System.out.printf("You checked %d books and found it.", counter);
    }
}
