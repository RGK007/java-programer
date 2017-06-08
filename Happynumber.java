import java.util.Scanner;

public class Happynumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=0;
         String b=String.valueOf(a);
         
        for(int i=0;i<a;i++)
        {
          
        String[] c=b.split("");
        for(String s1:c)
        {
            int d=Integer.parseInt(s1);
            sum=sum+(d*d);
        }
         if(sum==1)
                 {
                     i=a+10;
                 }
         else 
         {
            b=String.valueOf(sum);
        sum=0;
         }  
        
        }
        if(sum==1)
            System.out.println("happy number");
       else
            System.out.println("not happy number");
    }
    
}
