import java.io.*;
import java.util.*;
public class reversenumbers{
   public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
       int[] a=new int[5];
       for(int i=0;i<3;i++)
       {
           a[i]=s.nextInt();
       }
        for(int i=0;i<3;i++)
        {
            if(a[i]>0)
            {
                String c=Integer.toString(a[i]);
               String s4=new StringBuffer(c).reverse().toString();
        System.out.print(" "+s4);
         
            }
        }
              
