/*
 * Q4. WAP to  create two vectors and merge in the third vector and display it?
Q5. WAP to create Vector and reverse all elements of Vector without using the inbuilt method?
 */
import java.util.*;
public class MergeVector {
	public static void main(String x[])
	{
		Scanner s =new Scanner(System.in);
		
		Vector v = new Vector();
		System.out.println("Enter Array");
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		
		Vector v2 = new Vector();
		System.out.println("Enter Array");
		for(int i=0;i<5;i++)
		{
			v2.add(s.nextInt());
		}
		
		Vector v3 = new Vector();
		v3.addAll(v);
		v3.addAll(v2);
		
		for(int i=0;i<v3.size();i++)
		{
			System.out.println(v3.get(i));
		}
	}
}
