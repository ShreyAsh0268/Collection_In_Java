/*
 * Q2. WAP to store 10 string values in Vector and search string whose length is more than three and ends with sh 


 */
import java.util.*;
public class StringValueSearch {
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		
		Vector v= new Vector();
		System.out.println("Enter Vector");
		for(int i=0;i<2;i++)
		{
			v.add(s.nextLine());
		}
		
		
		for(int i=0;i<v.size();i++)
		{
			boolean b=((String) v.get(i)).endsWith("sh");
			if(b && ((String) v.get(i)).length()>=3)
			{
				System.out.println(v.get(i));
			}
		}
	}
}
