package twelve_may;

import java.util.*;

public class MinMaxList {

	public static void main(String[] args) {
		
		List <Integer> ll = new ArrayList <Integer> ();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Linked List size: ");
		int size = in.nextInt();
		System.out.print("Enter elements: ");
		for(int i=0; i<size; i++)
		{
			int n = in.nextInt();
			ll.add(n);
		}
		in.close();
		Collections.sort(ll);
		int min = ll.get(0);
		int max = ll.get(ll.size()-1);
		System.out.println("ArrayList Is: "+ll);
		System.out.println("Maximum Number Is: "+max);
		System.out.print("Minimum Number Is: "+min);
	}

}