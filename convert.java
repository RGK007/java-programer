
import java .util.*;
import java .io.*;
public class convert {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int a=s1.length();
        if(a>0)
        {
            char[] b=s1.toCharArray();
        int[] d=new int [a];
        for(int i=0;i<a;i++)
        {
            String t=Character.toString(b[i]);
           d[i]=Integer.parseInt(t); 
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(d[i]);
    }
        }
}
}

