/*
 Q1. WAP to create Vector and find the occurrence of elements in Vector?
Q2. WAP to find the duplicate values from Vector?
Q3. WAP to find the second highest element from a vector?
Q4. WAP to  create two vectors and merge in the third vector and display it?
Q5. WAP to create Vector and reverse all elements of Vector without using the inbuilt method?
*/
import java.util.*;
public class Occurence {
	public static void main(String x[]) {
		Scanner s = new Scanner(System.in);
		Vector v = new Vector();
		
		System.out.println("Enter Numbers");
		for(int i=0;i<5;i++) {
			v.add(s.nextInt());
		}
		
		Vector counted=new Vector();
		
		int count;
		for(int i=0;i<v.size();i++) {
			int current=(int)v.get(i);
			count=1;
			if(!counted.contains(current))
			{
			for(int j=i+1;j<v.size();j++) {
				if(v.get(j).equals(current))
				{
					count++;
				}
			}
			System.out.println(v.get(i)+"-------> "+count);
		  }
			counted.add(current);
		}
	}
}
