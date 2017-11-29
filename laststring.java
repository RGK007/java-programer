import java.util.*;

public class laststring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2="";
		/*int t=s1.length()-1;
		System.out.println(t);*/
		for(int i=s1.length()-1;i>=0;i--)
		{
			String s3=String.valueOf(s1.charAt(i));
			if(!s2.contains(s3))
			{
				s2=s2+s3;
			}
		}
		System.out.println(s2);
		
	}

}
