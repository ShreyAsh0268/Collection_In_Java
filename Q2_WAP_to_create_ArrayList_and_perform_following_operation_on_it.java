package collection_and_multithreding_and_file_handling;
import java.util.*;
/*
 Q2. WAP to create ArrayList and perform following operation on it 
	Case 1: add new data in ArrayList
	Case 2: view all data from ArrayList
Case 3: Search Data using contains method 
Case 4: Search data using indexOf() method 
Case 5: delete data using index
Case 6: count total number of element from ArrayList
Case 7: check ArrayList  is empty or not 

 */
public class Q2_WAP_to_create_ArrayList_and_perform_following_operation_on_it {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		do {
			System.out.println("\nCase 1: add new data in ArrayList"
					+ "\nCase 2: view all data from ArrayList\r\n"
					+ "Case 3: Search Data using contains method \r\n"
					+ "Case 4: Search data using indexOf() method \r\n"
					+ "Case 5: delete data using index\r\n"
					+ "Case 6: count total number of element from ArrayList\r\n"
					+ "Case 7: check ArrayList  is empty or not \n"
					+ "Enter Your Choice : ");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter which number of elements add you want ");
				int size = s.nextInt();
				System.out.println("Enter Elements");
				for(int i=0;i<size;i++) {
					al.add(s.nextInt());
				}
				break;
			case 2:
				for(Object obj:al) {
					System.out.print(obj+" ");
				}
				break;
			case 3:
				System.out.println("Enter Search Data");
				int data = s.nextInt();
				
				boolean b=al.contains(data);
				if(b) {
					System.out.println("Data Found");
				}
				else {
					System.out.println("Data Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Search Data");
				int data1 = s.nextInt();
				
				int index = al.indexOf(data1);
				if(index != -1) {
					System.out.println("Data Found");
				}
				else {
					System.out.println("Data Not Found");
				}
				break;
			case 5:
				System.out.println("Enter Index For delate Data");
				int i = s.nextInt();
				try {
					al.remove(i);
					System.out.println("After Data Delation ");
					for(Object obj:al) {
						System.out.print(obj+" ");
					}
				}
				catch (IndexOutOfBoundsException ex) {
					System.out.println("you put index is not present data less than this index then you want to perform operatin then put inde is less than"+al.size());
					System.out.println("Enter Index For delate Data");
					 i = s.nextInt();
					 al.remove(i);
						System.out.println("After Data Delation ");
						for(Object obj:al) {
							System.out.print(obj+" ");
						}
				}
				break;
			case 6:
				int total = al.size();
				System.out.println("Total count of elemnts in array list is : "+total);
				break;
			case 7:
				
				if(al.isEmpty()) {
					System.out.println("ArrayList Is Empty");
				}
				else {
					System.out.println("ArrayList Is Not Empty");
				}
				break;
			default :
				break;
			}
			
		}while(true);

	}

}
