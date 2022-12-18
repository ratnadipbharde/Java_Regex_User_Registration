import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Regex User Registration");
        Main main = new Main();
//        System.out.println("Enter First Name and Last Name : ");
//        String firstNameAndLastName = scanner.nextLine();
//        System.out.println(main.validateFirstName(firstNameAndLastName));
//        System.out.println("Enter email Id : ");
//        String email = scanner.nextLine();
//        System.out.println(main.validateEmail(email));
//        System.out.println("Enter Mobile Number : ");
//        String mobileNumber = scanner.nextLine();
//        System.out.println(main.validateMobileNumber(mobileNumber));
//        System.out.println("Enter Password : ");
//        String password = scanner.nextLine();
//        System.out.println(main.validatePassword(password));
        System.out.println("email partern");
        System.out.println(main.validateEmail("abc@yahoo.com"));
        System.out.println(main.validateEmail("abc-100@yahoo.com"));
        System.out.println(main.validateEmail("abc111@abc.com"));
        System.out.println(main.validateEmail("abc-100@abc.net"));
        System.out.println(main.validateEmail("abc.100@abc.com.au"));
        System.out.println(main.validateEmail("abc@1.com"));
        System.out.println(main.validateEmail("abc@gmail.com.com"));
        System.out.println(main.validateEmail("abc+100@gmail.com"));

    }

    private boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$", password);
    }

    private boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches("^(0|[0-9]{1,5})?([0-9]{10})$", mobileNumber);
    }

    private boolean validateEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
    }

    private boolean validateFirstName(String firstNameAndLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}[' '][A-Z][a-z]{2,}$", firstNameAndLastName);
    }
}