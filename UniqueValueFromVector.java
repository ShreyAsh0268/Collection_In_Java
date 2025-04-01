/*
 * Q4. WAP to store 10 values in Vector and find the unique values from vector?

 */
import java.util.*;
public class UniqueValueFromVector {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Vector");
		Vector v = new Vector();
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		
		Vector unique=new Vector();
		
		for(int i=0;i<v.size();i++)
		{
			int count=1;
			for(int j=i+1;j<v.size();j++)
			{
				if(v.get(i)==v.get(j))
				{
					count++;
				}
			}
			if(count<2)
			{
				System.out.println(v.get(i));
			}
		}
	}

}
