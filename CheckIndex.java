package checkindex;
import java.util.*;
import java.util.Arrays;
import java.io.*;
public class CheckIndex {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] e=new int[n];
        int x=e.length;
        if(x>0)
        {
         
        for(int i=0;i<n;i++)
        {
            e[i]=s.nextInt();
        }
        Arrays.sort(e);
        for(int i=0;i<n;i++)
        {
            if(e[i]==i)
            {
                System.out.println(e[i]);
            }
        }
        
    }
        else
            System.out.println("ENTER input array");
    }
    
    
}
