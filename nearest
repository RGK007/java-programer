package gk;

import java.util.*;

public class nearest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		TreeSet<Integer>g=new TreeSet<Integer>();
		int b=s.nextInt();
		int[] a=new int[b];
		for(int i=0;i<b;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<b;j++)
			{
				g.add(a[i]+a[j]);
			}
		}
		int sum=g.first();
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(sum==(a[i]+a[j]))
				{
					System.out.println(a[i]+" "+a[j]+" "+sum);
				}
			}
		}
		
	}

}
