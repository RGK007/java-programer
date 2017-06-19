
import java.util.*;
import java.io.*;
public class palindrome {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int flag=0;
String s1=s.nextLine();
char[] c=s1.toCharArray();
StringBuffer s2=new StringBuffer(s1);
String s3=String.valueOf(s2.reverse());
char[] g=s3.toCharArray();
for(int i=0;i<g.length;i++)
{
    if(c[i]==g[i])
    {
        flag++;
    }
    else
        flag=0;
    
}
if(flag==c.length)
            System.out.println("palindrome");
else
            System.out.println("not palindrome");
    }
    
}
