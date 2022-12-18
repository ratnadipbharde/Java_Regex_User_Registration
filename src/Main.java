import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Regex User Registration");
        Main main = new Main();
        System.out.println("Enter First Name and Last Name : ");
        String firstNameAndLastName = scanner.nextLine();
        System.out.println(main.validateFirstName(firstNameAndLastName));
        System.out.println("Enter email Id : ");
        String email = scanner.nextLine();
        System.out.println(main.validateEmail(email));
    }

    private boolean validateEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9.! #$%&'*+/=? ^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\. [a-zA-Z0-9-]+)*$", email);
    }

    private boolean validateFirstName(String firstNameAndLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}[' '][A-Z][a-z]{2,}$", firstNameAndLastName);
    }
}