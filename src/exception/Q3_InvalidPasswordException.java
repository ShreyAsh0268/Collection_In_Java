package exception;
import java.util.*;
/*
 Q3. InvalidPasswordException
Description: Suppose consider we are working on Login Application and we have one class name as PasswordChecker and this class check the password enter by user and password checking rules given below
Password length must be minimum 8 char 
Password must be contain at  least on capital letter
Password must be contain at least on digit 
Password must be contained at one special symbol
Note: if any one of above criteria not match in user password then system should generate exception InvalidPasswordException 
 */
class InvalidPasswordException extends Exception{
	public  InvalidPasswordException(String message) {
		super(message);
	}
}

class PasswordValidator{
	String pass;
	public void checkPassword(String pass) throws InvalidPasswordException {
		
		if (pass.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (!hasUppercase) {
            throw new InvalidPasswordException("Password must contain at least one capital letter.");
        }

        if (!hasDigit) {
            throw new InvalidPasswordException("Password must contain at least one digit.");
        }

        if (!hasSpecial) {
            throw new InvalidPasswordException("Password must contain at least one special character.");
        }

        System.out.println(" Password is valid!");
	}
}
public class Q3_InvalidPasswordException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Passwoard");
		String pass = s.nextLine();
		
		PasswordValidator pv = new PasswordValidator();
		try {
			pv.checkPassword(pass);
        } catch (InvalidPasswordException e) {
            System.out.println(" Invalid Password: " + e.getMessage());
        }
	}

}
