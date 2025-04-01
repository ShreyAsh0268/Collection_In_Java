/*
 * Q1. WAP to store 5 values in Vector and search value present in vector without usign any inbuilt methods like as contains() or indexOf() 
Note: we can use get() method 



 */
import java.util.*;
public class SearchValues {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Vector");
		Vector v= new Vector();
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		
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
		
	}

}
