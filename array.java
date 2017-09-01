import java.util.*;

public class array {

	public static void main(String[] args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the array");
	int a=sin.nextInt();
	int[] b=new int[a];
	for(int i=0;i<a;i++)
	{
		b[i]=sin.nextInt();
	}
	  for(int i=1;i<a;i++){
	    	 for(int j=i+1;j<a;j++){
	    		 if(b[i]<b[j]){
	    			 b[i]=b[j];
	    		 }
	    	 }
	    	 System.out.print(b[i]+",");
	     }
	     System.out.print("0");
		}
}
