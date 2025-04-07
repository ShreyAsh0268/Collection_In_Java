package exception;
import java.util.*;
//Write program for  handle the ArithmeticException
public class Q5_Write_program_for_handle_the_ArithmeticException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Value");
		int value = s.nextInt();
		
		System.out.println("Enter Diviser");
		int divs = s.nextInt();
		
		try {
			int rem = value/divs;
			System.out.println("Reminder is : "+rem);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("you provide diviser value is zero and its not working \n because its repetate infinite plese provide \n diviser value is non zero");
		}

	}

}
