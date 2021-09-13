import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = scanner.nextLine();
        System.out.println("Who said it?");
        String author = scanner.nextLine();
        char character = '"';
        System.out.println(author+" says, "+character+quote+character);

    }
}
