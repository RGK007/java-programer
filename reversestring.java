
import java.io.*;
import java.util.*;
public class reversestring {
   public static void main(String[] args) {
        
      Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String s2=new StringBuffer(a).reverse().toString();
        System.out.println(s2);
   }
}
