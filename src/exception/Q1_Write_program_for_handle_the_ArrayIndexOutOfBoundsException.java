package exception;
import java.util.*;
//Write program for handle the ArrayIndexOutOfBoundsException 
public class Q1_Write_program_for_handle_the_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size = s.nextInt();
	
		int a[] = new int[size];
		
		System.out.println("Enter Array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter Index For featch data");
		int index = s.nextInt();
		
		try {
			System.out.println("Element on index "+index+" is : "+a[index]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Enter Valide index means gretaer than equal 0 and less than "+size);
		}
	}

}
