import java.util.*;

public class substrings {

	public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sin.nextLine();
	String s1=sin.nextLine();
	if(s.contains(s1))
	{
		char c=s1.charAt(0);
	for(int i=0;i<s.length();i++)
	{
		char c1=s.charAt(i);
		if(c1==c)
		{
			System.out.println(i);
			break;
		}
	}
	}
	else
		System.out.println(-1);

}
}
