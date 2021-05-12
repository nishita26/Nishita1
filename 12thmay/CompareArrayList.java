package twelve_may;
import java.util.*;
public class CompareArrayList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		ArrayList <Integer> a2 = new ArrayList <Integer> ();
		System.out.print("Enter The Size Of 1st Array: ");
		int n1 = in.nextInt();
		System.out.print("Enter The Elements Of 1st Array: ");
		for(int i=0;i<n1;i++)
		{
			a1.add(in.nextInt());
		}
		System.out.print("Enter The Size Of 2nd Array: ");
		int n2 = in.nextInt();
		System.out.print("Enter The Elements Of 2nd Array: ");
		for(int i=0;i<n2;i++)
		{
			a2.add(in.nextInt());
		}
		if(a1.equals(a2))
		{
			System.out.println("Both Are Equal with Size: "+a1.size());
		}
		else {
			System.out.println("Both Are Not Equal An Size For 1st Array is: "+a1.size()+" and Size Of 2nd Array is: "+a2.size());
		}
		in.close();
	}

}