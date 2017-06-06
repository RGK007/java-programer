import java.util.*;
import java.util.Scanner;
	public class firstrepeated
	{
	    public static void main(String[] args) 
	    {
        int n, flag = 0, count = 0,b = 0;
	        Scanner s = new Scanner(System.in);
        n = s.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        for(int i = 0; i < n; i++)
	        {
	            for(int j = 0; j < n; j++)
	            {
                            if(flag==0)
                            {
	                if(i != j)
                    if(a[i] == a[j])
	                    {
                                flag++;
	                      b=a[i];
                              break;
                            }
                    }
                }
                }
                System.out.println(b);
}    }	
