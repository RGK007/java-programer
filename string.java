import java.util.*;

public class string {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='x')
			{
				if(Character.isDigit(s1.charAt(i-1)))
				{
					int a=Integer.parseInt(String.valueOf(s1.charAt(i-1)));
					for(int j=0;j<a;j++)
					{
						System.out.print(s1.charAt(i+1));
					}
					i=i+2;
				}
			}
			System.out.print(s1.charAt(i));
		}
		
		

	}

}
