import java.util.*;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		String s1 = sin.nextLine();
		String s2 = sin.nextLine();
		if(s1.length()>0 && s2.length()>0)
		{
		char c[] = s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			int a=(int)s1.charAt(i)+10;
			System.out.print((char)a);
		}
		System.out.print(" ");
		for(int i=1;i<s2.length()-1;i++)
		{
			int b = (int)s2.charAt(i)+10;
			if(b>122)
			{
				b = 122 - b;
				if(b>0)
				{
					b = b + 96;
					
				}
				else
				{
					int temp = b * (-1);
					b = temp + 96;
				}
				c[i] = (char)b;
			}
			else
			{
				c[i] = (char)b;
			}
			
		}
		String s3 = new String(c);
		System.out.print(s3);
	}
	else
		System.out.println("invalid");
	}
}
