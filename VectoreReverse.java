/*
 * Q5. WAP to create Vector and reverse all elements of Vector without using the inbuilt method?
 */
import java.util.*;
public class VectoreReverse {
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter Vectore");
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		
		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
				int temp=(int) v.get(i);
				v.set(i, v.get(j));
				
				v.set(j,temp);
			}
		}
		System.out.println(v);
	}

}
