
import java.util.*;

public class subset {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1 array size");
		int a=s.nextInt();
		int[] a1=new int[a];
		System.out.println("enter the 1 array element");
		for(int i=0;i<a;i++)
		{
			a1[i]=s.nextInt();
		}
		
		System.out.println("enter the 2 array size");
		int b=s.nextInt();
		int[] a2=new int[b];
		int count=0;
		System.out.println("enter the 2 array element");
		for(int i=0;i<b;i++)
		{
			a2[i]=s.nextInt();
		}
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
					break;
				}
			}
		}
		if(a1.length==count)
		{
			System.out.println("subset");
		}
		else
			System.out.println("not subset");

	}

}
