import java.util.*;
public class queue {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner (System.in);
System.out.println("Enter the Array size");        
int size=s.nextInt();
System.out.println("Enter the array elements");   
int array[]=new int[size];
for(int i=0;i<array.length;i++){
	array[i]=s.nextInt();
}
int arr[]=new int[(size)/2];

for(int j=0;j<array.length;j++){
	if((j%2)==0){
		arr[count]=array[j];
		count++;
	}
}
for(int j=0;j<arr.length;j=j+6){
	System.out.println(arr[j]);                   
}
	}
}
