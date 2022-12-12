import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Regex User Registration");
        Main main = new Main();
        System.out.println("Enter Name : ");
        String name = scanner.next();
        System.out.println(main.validateFirstName(name));
    }

    private boolean validateFirstName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", name);
    }
}