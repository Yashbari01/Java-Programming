import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

class Registration {
    private static final String USERNAME_ERROR = "Username must be at least 3 characters long.";
    private static final String NAME_ERROR = "Name must contain only alphabetic characters.";
    private static final String SURNAME_ERROR = "Surname must contain only alphabetic characters.";
    private static final String GENDER_ERROR = "Gender must be 'Male' or 'Female'.";
    private static final String PHONE_ERROR = "Phone Number must be exactly 10 digits.";
    private static final String EMAIL_ERROR = "EmailID must be in a valid format (example@example.com).";
    private static final String PASSWORD_ERROR = "Password must be at least 6 characters long and include uppercase, lowercase, digits, and special characters.";
    private static final String CONFIRM_PASSWORD_ERROR = "Passwords do not match. Please try again.";

    private static final String EMAIL_PATTERN = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";

    private static final Map<String, String> userCredentials = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Registration Form");
            
            // Registration logic
            String userName = getValidInput("Enter username (at least 3 characters):", 
                                            USERNAME_ERROR, 
                                            input -> input.length() >= 3);

            String name = getValidInput("Enter Name (alphabetic characters only):", 
                                         NAME_ERROR, 
                                         input -> input.matches("[a-zA-Z]+"));

            String surname = getValidInput("Enter Surname (alphabetic characters only):", 
                                            SURNAME_ERROR, 
                                            input -> input.matches("[a-zA-Z]+"));

            String gender = getValidInput("Enter Gender (Male/Female):", 
                                           GENDER_ERROR, 
                                           input -> input.equalsIgnoreCase("Male") || input.equalsIgnoreCase("Female"));

            String phoneNumber = getValidInput("Enter Phone Number (10 digits):", 
                                                PHONE_ERROR, 
                                                input -> input.matches("\\d{10}"));

            String emailID = getValidInput("Enter EmailID (example@example.com):", 
                                            EMAIL_ERROR, 
                                            input -> Pattern.matches(EMAIL_PATTERN, input));

            String password = getValidInput("Enter Password (at least 6 characters, including uppercase, lowercase, digits, and special characters):", 
                                             PASSWORD_ERROR, 
                                             Registration::isValidPassword);

            String confirmPassword = getValidInput("Confirm Password:", 
                                                    CONFIRM_PASSWORD_ERROR, 
                                                    input -> input.equals(password));

            // Store the user credentials
            userCredentials.put(userName, password);

            // Displaying the validated information
            System.out.println("Registration Successful");
            System.out.println("Username: " + userName);
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Gender: " + gender);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("EmailID: " + emailID);
            System.out.println("Password has been set successfully.");

            // Login logic
            System.out.println("Login Form");

            String loginUserName = getValidInput("Enter username for login:", 
                                                 "Username does not exist.", 
                                                 input -> userCredentials.containsKey(input));
            
            String loginPassword = getValidInput("Enter password for login:", 
                                                 "Incorrect password.", 
                                                 input -> userCredentials.get(loginUserName).equals(input));

            System.out.println("Login Successful");

        } finally {
            scanner.close(); // Ensure the scanner is closed to avoid resource leaks
        }
    }

    // Method to validate input with a custom condition
    private static String getValidInput(String prompt, String errorMessage, java.util.function.Predicate<String> condition) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println(prompt);
            input = scanner.nextLine();
            if (condition.test(input)) {
                break;
            } else {
                System.out.println(errorMessage);
            }
        }
        return input;
    }

    // Method to validate password
    private static boolean isValidPassword(String password) {
        return password.length() >= 6 &&
               Pattern.compile("[A-Z]").matcher(password).find() &&
               Pattern.compile("[a-z]").matcher(password).find() &&
               Pattern.compile("\\d").matcher(password).find() &&
               Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find();
    }
}
