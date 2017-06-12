import java.util.*;
import java.io.*;
public class sortarr {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
char[] c=s1.toCharArray();
int h=c.length;
Arrays.sort(c);

int k=s.nextInt();
for(int i=0;i<k;i++)
{
    System.out.print(c[i]);
}
    }
    
}
