package no;
import java.util.*;

public  class uniqueelement {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int[] b=new int[a];
	int flag=0;
	for(int i=0;i<a;i++)
	{
		b[i]=s.nextInt();
	}
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<a;j++)
		{
			if(i!=j)
			{
				
				if(b[i]==b[j])
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
		}
			if(flag==0)
			{
				System.out.println(b[i]);
			}
	}
	}
	} 
