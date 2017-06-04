
import java.io.*;
import java.util.*;
public class reversestring {
   public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value is integer(1) ot string(0)");
       int b=s.nextInt();
       switch(b)
       {
           case 0:  String a=s.nextLine();
        String s2=new StringBuffer(a).reverse().toString();
        System.out.println(s2);  
               break;
           case 1: String c=s.nextLine();
               String s4=new StringBuffer(c).reverse().toString();
        System.out.println(s4);
               break;
           default:System.out.println("Invalid");
       
       
    }
   }
}
