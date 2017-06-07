package gtal;
import java.util.*;
import java.io.*;
import java.util.Arrays;
public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the range");
        int a=s.nextInt();
        for(int i=1;i<=a;i++)
        {        flag=0;
                      for(int j=2;j<i;j++)
            {
               if(i%j==0)
                {
                    flag=1;  
                }          
            }
             if(flag==0)
                    System.out.print(i+ " ");
            
       
        }
           
        }
  
    }
    

