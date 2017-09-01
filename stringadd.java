import java.util.*;

public class stringadd {

	public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sin.next();
	String s1=sin.next();
	if(s.length()>0 && s1.length()>0)
	{
		String d=String.valueOf((Integer.parseInt(s)*Integer.parseInt(s1)));
		System.out.println(d);
				
	}
  else
  System.out.print("invalid");
	}

}
