/*
 Q3. WAP to find the second highest element from a vector?
*/
import java.util.*;
public class SecondHighest {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		Vector v = new Vector();
		
		System.out.println("Enter Array");
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		System.out.println("Seccond Highest Element");
		
		int max=(int) v.get(0); 
		int secondMax=(int) v.get(0);
		
		for(int i=0;i<v.size();i++)
		{
			int next = (int)v.get(i);
			if(max<next)
			{
				secondMax=max;
				max=next;
			}
			else if(next>secondMax && next!=max)
			{
				secondMax=next;
			}
		}
		System.out.println(secondMax);
	}
}
