package collection_and_multithreding_and_file_handling;
import java.util.*;
/*
 * Q1.WAP to create Vector class and store 5 values in it and display vector data using a following methods 

Show the vector data using Enumeration 
Show the vector data using Iterator 
Show the vector data using normal for loop
Show the vector data using foreach 
Show the vector data using ListIterator

 */
public class Q1_WAP_to_create_Vector_class {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Vector v =new Vector();
		
		System.out.println("Enter value for add vectore");
		for(int i=0;i<5;i++) {
			v.add(s.nextInt());
		}
	
		System.out.println("Show the vector data using Enumeration");
		Enumeration enm = v.elements();
		while(enm.hasMoreElements()) {
			Object obj = enm.nextElement();
			System.out.print(obj+" ");
		}
		
		System.out.println("\n Show the vector data using Iterator");
		Iterator i = v.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			System.out.print(obj+" ");
		}
		
		System.out.println("\n Show the vector data using normal for loop");
		for(int j=0;j<v.size();j++) {
			System.out.print(v.get(j)+" ");
		}
		
		System.out.println("\n Show the vector data using foreach");
		for(Object obj:v) {
			System.out.print(obj+" ");
		}
		
		System.out.println("\n Show the vector data using ListIterator");
		ListIterator li = v.listIterator();
		
		System.out.println("\t Forward Direction");
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.print(obj+" ");
		}
		
		System.out.println("\n\t Backward Direction");
		while(li.hasPrevious()) {
			Object obj = li.previous();
			System.out.print(obj+" ");
		}
		
	}

}
