import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Regex User Registration");
        Main main = new Main();
        System.out.println("Enter First Name and Last Name : ");
        String name = scanner.nextLine();
        System.out.println(main.validateFirstName(name));
    }

    private boolean validateFirstName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}[' '][A-Z][a-z]{2,}$", name);
    }
}