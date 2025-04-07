package exception;
import java.util.*;
//Write a program for  handle the NullPointerException 
public class Q3_Write_a_program_for_handle_the_NullPointerException {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException ne) {
			System.out.println("We try to find String length but we are initalize string as null");
		}

	}

}
