/*
 * Q3. WAP to store 10 string values in Vector and count the total number vovles in all strings of Vector?

Q4. WAP to store 10 values in Vector and find the unique values from vector?
 */
import java.util.*;
public class CountVovels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Vector");
		Vector v=new Vector();
		
		for(int i=0;i<2;i++)
		{
			v.add(s.nextLine());
		}
		
		int sum=0;
		for(int i=0;i<v.size();i++)
		{
			
			char ch[]=((String) v.get(i)).toCharArray();
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
				{
					count++;
				}
			}
			sum=sum+count;
		}
		System.out.println("Total No of Vovels in All String : "+sum);
	}
}
