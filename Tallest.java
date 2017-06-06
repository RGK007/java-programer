import java.util.*;
import java.util.Arrays;
import java.io.*;

public class Tallest {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      float[] a=new float[n];
      for(int i=0;i<n;i++)
      {
          a[i]=s.nextFloat();
      }
        Arrays.sort(a);
        int z=s.nextInt();
        int b=a.length;
        int k=b-z;
        System.out.println(a[k]);
    }
    
}
