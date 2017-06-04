import java.io.*;
import java.util.*;
public class factorial {
   public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=1,c=0;
        if(a>0)
        {
         for(int i=1;i<=a;i++)
         {
             b=b*i;
         }
        }
        System.out.println(b);
   }
}
