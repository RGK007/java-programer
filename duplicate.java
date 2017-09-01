import java.util.*;

public class duplicate {

	public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sin.nextLine();
	char[] c=s.toCharArray();
	LinkedHashSet<Character> sb=new LinkedHashSet<Character>();
	for(int i=0;i<c.length;i++)
	{
		sb.add(c[i]);
	}
	String s1="";
	for(char v:sb)
	{
		s1=s1+v;
	}
	System.out.println(s1);
	
	}

}
