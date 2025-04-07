package collection_and_multithreding_and_file_handling;
import java.util.*;
/*
 Q3. WAP to create LinkedList and perform the following operation on it.
	Case 1: add Node at first 
	Case 2: add Node at last 
	Case 3: remove node from first 
	Case 4: remove node from last 
	Case 5: view all data from linked list

 */
public class Q3_WAP_to_create_LinkedList_and_perform_the_operation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		LinkedList li = new LinkedList();
		
		System.out.println("Enter Size of list data");
		int size = s.nextInt();
		
		System.out.println("Enter intial data for adding list");
		for(int i=0;i<size;i++) {
			li.add(s.nextInt());
		}
		
		do {
			System.out.println("\n Case 1: add Node at first \n"
					+ "	Case 2: add Node at last \n"
					+ "	Case 3: remove node from first \n"
					+ "	Case 4: remove node from last \n"
					+ "	Case 5: view all data from linked list");
			System.out.println("Enter your choice");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Value for add");
				li.addFirst(s.nextInt());
				System.out.println("Data present in list is after operation perform ");
				for(Object obj:li) {
					System.out.print(obj+" ");
				}
				break;
			case 2:
				System.out.println("Data present in list is after operation perform ");
				li.addLast(s.nextInt());
				System.out.println("Data present in list is ");
				for(Object obj:li) {
					System.out.print(obj+" ");
				}
				break;
			case 3:
				li.removeFirst();
				System.out.println("Data present in list is after operation perform ");
				for(Object obj:li) {
					System.out.print(obj+" ");
				}
				break;
			case 4:
				li.removeLast();
				System.out.println("Data present in list is after operation perform ");
				for(Object obj:li) {
					System.out.print(obj+" ");
				}
				break;
			case 5:
				System.out.println("Data present in list is at last");
				for(Object obj:li) {
					System.out.print(obj+" ");
				}
				break;
				default:
					break;
			}
		}while(true);
		
		
		
	}

}
