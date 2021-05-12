package twelve_may;

import java.util.*;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		System.out.print("Enter numbers: ");
		for(int i=0; i<size; i++)
		{
			int n = sc.nextInt();
			a1.add(n);
		}
		Object arr[] = a1.toArray();
		System.out.print("Converted Array From ArrayList: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		List<Object> a2 = Arrays.asList(arr);
		System.out.print("\nConverted ArrayList From Array: "+a2);
	}

}
