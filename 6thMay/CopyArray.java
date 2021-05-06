//Program to copy all elements of one array into another array
import java.util.*;
public class CopyArray {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the length of Array:");
		int l=in.nextInt();
		int x[]=new int[l];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<l;i++)
			x[i]=in.nextInt();
		in.close();
		int y[]=new int[x.length];
		
		//copy one array to another
		for(int i=0;i<x.length;i++)
			y[i]=x[i];
		
		//Display array
		System.out.println("First Array: ");
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		
		System.out.println("Second Array: ");
		for(int i=0;i<y.length;i++)
			System.out.print(y[i]+" ");	
	}
}
