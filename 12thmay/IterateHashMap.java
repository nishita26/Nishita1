package twelve_may;

import java.util.*;

public class IterateHashMap {

	public static void main(String[] args) {
		
		Map <Integer,String> m = new HashMap <Integer,String> ();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter map size: ");
		int size = in.nextInt();
		System.out.print("Enter values: ");
		for(int i=1; i<=size; i++)
		{
			String n = in.next();
			m.put(i, n);
		}
		in.close();
		System.out.print("Hashmap: "+m);
	}

}
