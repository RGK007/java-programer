import java.util.*;

public class reverse {

	public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sin.nextLine();
		if(s.length()>0)
		{
	String[] sb=s.split(" ");
	for(int i=0;i<sb.length;i++)
	{
		StringBuffer s1=new StringBuffer(sb[i]);
		sb[i]=String.valueOf(s1.reverse());
	}
	
for(int i=0;i<sb.length;i++)
{
	System.out.print(sb[i]+" ");
}
		}
		else
			System.out.print("Enter the string correctly");
	}

}
