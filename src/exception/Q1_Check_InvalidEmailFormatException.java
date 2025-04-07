package exception;
import java.util.*;
/*
 * Q1. Check InvalidEmailFormatException 
Description: you have created an application for checking if an email entered by a user is proper or not means email 
must contain @ and . (dot operator) and after dot operator there must 2 or 3 characters and dot may be repeat  and @ must 
be only once in email and if this criteria is not  match then system should generate exception at run time InvalidEmailFormatException

 */
class InvalidEmailFormatException extends Exception {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

class EmailValidator {
	String email;
	public void checkMail(String email) throws InvalidEmailFormatException {
		
		if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailFormatException("Email must contain '@' and '.'");
        }
		
		int atCount = email.length() - email.replace("@","").length();
        if (atCount != 1) {
            throw new InvalidEmailFormatException("Email must contain exactly one '@'");
        }
        
        int lastDot = email.lastIndexOf(".");
        String end = email.substring(lastDot + 1);
        if (end.length() < 2 || end.length() > 3) {
            throw new InvalidEmailFormatException("After '.' there must be 2 or 3 characters");
        }

        System.out.println(" Email is valid.");
	}
}
public class Q1_Check_InvalidEmailFormatException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Email");
		String email = s.nextLine();
		
		EmailValidator ev = new EmailValidator();
		
		try {
			ev.checkMail(email);
		}
		catch(InvalidEmailFormatException iee) {
			System.out.println(iee.getMessage());
		}

	}

}
