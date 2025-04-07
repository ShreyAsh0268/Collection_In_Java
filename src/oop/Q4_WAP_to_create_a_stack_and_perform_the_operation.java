package oop;
import java.util.*;
/*
 Q4. WAP to create a stack and perform the following operation on it.
	Case1: push data in stack 
	Case 2: pop data from stack
	Case 3: display all data from stack

 */
public class Q4_WAP_to_create_a_stack_and_perform_the_operation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Stack st = new Stack();
		
		do {
			System.out.println("Case1: push data in stack \r\n"
					+ "	Case 2: pop data from stack\r\n"
					+ "	Case 3: display all data from stack");
			System.out.println("Enter Your choice");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Element for adding in stack");
					st.push(s.nextInt());
				break;
			case 2:
				st.pop();
				System.out.println("Stack after perfom pop operation");
				System.out.println(st);
				break;
			case 3:
				System.out.println("Stack data");
				System.out.println(st);
				break;
			}
			}while(true);

	}

}
