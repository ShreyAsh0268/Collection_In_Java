package exception;
import java.util.*;
//Write program for  handle the StringIndexOutOfBoundsException 
public class Q4_Write_program_for_handle_the_StringIndexOutOfBoundsException {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = s.nextLine();
		try {
			System.out.println("Enter Index of character you want from String");
			int index = s.nextInt();
			System.out.println(str.charAt(index));
		}
		catch(StringIndexOutOfBoundsException sx) {
			System.out.println("plese enter valid index means "
					+ "\n greater than equal to 0 and less than "+str.length());
		}
	}

}
