/*
 * Q 1. Write a java program to create arraylist and perform following operations using switch case and do while.

1. Add 10 Values In Arraylist.
2. Display All Values In Arraylist.
3. Add New Value In Arraylist.
4. Search Value In Arraylist.
5. Sort All Values In Ascending Order In Arraylist.
6. Sort All Values In Descending Order In Arraylist.
7. Find Max Value In Arraylist.
8. Find Min Value In Arraylist.
9. Update Value In Arraylist.
10. Delete Value In Arraylist.
 */
import java.util.*;
public class Arraylistoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		ArrayList a=new ArrayList();
		int choice;
		do {
			
			System.out.println("Add 10 Values In Arraylist.\r\n"
					+ "2. Display All Values In Arraylist.\r\n"
					+ "3. Add New Value In Arraylist.\r\n"
					+ "4. Search Value In Arraylist.\r\n"
					+ "5. Sort All Values In Ascending Order In Arraylist.\r\n"
					+ "6. Sort All Values In Descending Order In Arraylist.\r\n"
					+ "7. Find Max Value In Arraylist.\r\n"
					+ "8. Find Min Value In Arraylist.\r\n"
					+ "9. Update Value In Arraylist.\r\n"
					+ "10. Delete Value In Arraylist.");
			System.out.println("Enter Ypur choice");
			choice=s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter 10 Values for adding ArrayList");
				
				for(int i=0;i<5;i++)
				{
					a.add(s.nextInt());
				}
				break;
			case 2:
				System.out.println(a);
				break;
			case 3:
				a.add(s.nextInt());
				break;
			case 4:
				System.out.println("Enter Value For search in ArrayList");
				int value=s.nextInt();
				boolean flag=false;
				for(int i=0;i<a.size();i++)
				{
					if(value==(int) a.get(i))
					{
						flag = true;
					}
				}
				if(flag==true)
				{
					System.out.println("Value Present in ArrayList");
				}
				else
				{
					System.out.println("Value Not Present in ArrayList");
				}
				break;
			case 5:
				for(int i=0;i<a.size();i++)
				{
					for(int j=i+1;j<a.size();j++)
					{
						int t1=(int) a.get(i);
						int t2=(int) a.get(j);
						
						if(t1>t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						a.set(i, t1);
						a.set(j, t2);
					}
				}
				break;
			case 6:
				for(int i=0;i<a.size();i++)
				{
					for(int j=i+1;j<a.size();j++)
					{
						int t1=(int) a.get(i);
						int t2=(int) a.get(j);
						
						if(t1<t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						a.set(i, t1);
						a.set(j, t2);
					}
				}
				break;
			case 7:
				for(int i=0;i<a.size();i++)
				{
					for(int j=i+1;j<a.size();j++)
					{
						int t1=(int) a.get(i);
						int t2=(int) a.get(j);
						
						if(t1>t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						a.set(i, t1);
						a.set(j, t2);
					}
				}
				System.out.println(a.getLast());
				break;
			case 8:
				for(int i=0;i<a.size();i++)
				{
					for(int j=i+1;j<a.size();j++)
					{
						int t1=(int) a.get(i);
						int t2=(int) a.get(j);
						
						if(t1<t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						a.set(i, t1);
						a.set(j, t2);
					}
				}
				System.out.println(a.getFirst());
				break;
			case 9:
				System.out.println("Enter Value for update");
				int uv=s.nextInt();
				System.out.println("Enter Index");
				int index=s.nextInt();
				
				for(int i=0;i<a.size();i++)
				{
					if(index==i)
					{
						a.set(i, uv);
					}
				}
				break;
			case 10:
				System.out.println("Enter Index");
				int ind=s.nextInt();
				
				for(int i=0;i<a.size();i++)
				{
					if(ind==i)
					{
						a.remove(i);
					}
				}
				break;
			}
		}while(true);
	}

}
