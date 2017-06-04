
import java.io.*;
import java.util.*;
public class reversestring {
   public static void main(String[] args) {
        
      Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int b=a.length();
        if(b>0)
        {
        String s2=new StringBuffer(a).reverse().toString();
        System.out.println(s2);
        }
        else
        System.out.println("Invalid");
   }
}
