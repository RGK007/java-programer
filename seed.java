import java.util.*;

public class seed {

	public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the number:");
	int a=sin.nextInt();
	int m=1,x,f=1;
	int y=a;
	while(y>0)
	{
		x=y%10;
		m=m*x;
		y=y/10;
	}//System.out.print(m);
	f=m*a;
	System.out.print(a+"is a seed of" +f);
}
}
