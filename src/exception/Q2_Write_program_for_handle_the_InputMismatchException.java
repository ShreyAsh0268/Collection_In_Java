package exception;
import java.util.*;
//Write program for handle the InputMismatchException 
public class Q2_Write_program_for_handle_the_InputMismatchException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Enter Id");
			int Id = s.nextInt();
			s.nextLine();
			System.out.println("Enter Name");
			String name = s.nextLine();
		}
		catch(InputMismatchException ie) {
			System.out.println("Enter Vlide Input \n"
					+ "first is id it allow only numbers its int formate\n"
					+ "second is name its string format");
		}

	}

}
