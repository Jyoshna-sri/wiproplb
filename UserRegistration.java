import java.util.Scanner;

// Step 1: User defined exception
class InvalidCountryException extends Exception {
    // Step 2: Overload constructors
    public InvalidCountryException() {
        super();
    }
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {
    
    // Step 3: Method to register user
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if(!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration ur = new UserRegistration();
        
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            
            System.out.print("Enter userCountry: ");
            String userCountry = sc.nextLine();
            
            ur.registerUser(username, userCountry);
            
        } catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException: " + e.getMessage());
        }
        
        sc.close();
    }
}