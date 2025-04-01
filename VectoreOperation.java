/*
 * Q 2. Write a java program to create Vector and perform following operations using switch case and do while.

1. Add 10 Values In Vector.
2. Display All Values In Vector.
3. Add New Value In Vector.
4. Search Value In Vector.
5. Sort All Values In Ascending Order In Vector.
6. Sort All Values In Descending Order In Vector.
7. Find Max Value In Vector.
8. Find Min Value In Vector.
9. Update Value In Vector.
10. Delete Value In Vector.
 */
import java.util.*;
public class VectoreOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		Vector v=new Vector();
		
		int choice;
		do {
			
			System.out.println("1. Add 10 Values In Vector.\r\n"
					+ "2. Display All Values In Vector.\r\n"
					+ "3. Add New Value In Vector.\r\n"
					+ "4. Search Value In Vector.\r\n"
					+ "5. Sort All Values In Ascending Order In Vector.\r\n"
					+ "6. Sort All Values In Descending Order In Vector.\r\n"
					+ "7. Find Max Value In Vector.\r\n"
					+ "8. Find Min Value In Vector.\r\n"
					+ "9. Update Value In Vector.\r\n"
					+ "10. Delete Value In Vector.");
			System.out.println("Enter Ypur choice");
			choice=s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter 10 Values for adding vectore");
				
				for(int i=0;i<5;i++)
				{
					v.add(s.nextInt());
				}
				break;
			case 2:
				System.out.println(v);
				break;
			case 3:
				v.add(s.nextInt());
				break;
			case 4:
				System.out.println("Enter Value For search in vector");
				int value=s.nextInt();
				boolean flag=false;
				for(int i=0;i<v.size();i++)
				{
					if(value==(int) v.get(i))
					{
						flag = true;
					}
				}
				if(flag==true)
				{
					System.out.println("Value Present in vector");
				}
				else
				{
					System.out.println("Value Not Present in vector");
				}
				break;
			case 5:
				for(int i=0;i<v.size();i++)
				{
					for(int j=i+1;j<v.size();j++)
					{
						int t1=(int) v.get(i);
						int t2=(int) v.get(j);
						
						if(t1>t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						v.set(i, t1);
						v.set(j, t2);
					}
				}
				break;
			case 6:
				for(int i=0;i<v.size();i++)
				{
					for(int j=i+1;j<v.size();j++)
					{
						int t1=(int) v.get(i);
						int t2=(int) v.get(j);
						
						if(t1<t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						v.set(i, t1);
						v.set(j, t2);
					}
				}
				break;
			case 7:
				for(int i=0;i<v.size();i++)
				{
					for(int j=i+1;j<v.size();j++)
					{
						int t1=(int) v.get(i);
						int t2=(int) v.get(j);
						
						if(t1>t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						v.set(i, t1);
						v.set(j, t2);
					}
				}
				System.out.println(v.lastElement());
				break;
			case 8:
				for(int i=0;i<v.size();i++)
				{
					for(int j=i+1;j<v.size();j++)
					{
						int t1=(int) v.get(i);
						int t2=(int) v.get(j);
						
						if(t1<t2)
						{
							int temp=t1;
							t1=t2;
							t2=temp;
						}
						v.set(i, t1);
						v.set(j, t2);
					}
				}
				System.out.println(v.getFirst());
				break;
			case 9:
				System.out.println("Enter Value for update");
				int uv=s.nextInt();
				System.out.println("Enter Index");
				int index=s.nextInt();
				
				for(int i=0;i<v.size();i++)
				{
					if(index==i)
					{
						v.set(i, uv);
					}
				}
				break;
			case 10:
				System.out.println("Enter Index");
				int ind=s.nextInt();
				
				for(int i=0;i<v.size();i++)
				{
					if(ind==i)
					{
						v.remove(i);
					}
				}
				break;
			}
		}while(true);
	}

}
