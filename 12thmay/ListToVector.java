package twelve_may;

import java.util.*;

public class ListToVector {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter list size: ");
		int size = in.nextInt();
		System.out.print("Enter numbers: ");
		for(int i=0; i<size; i++)
		{
			int n = in.nextInt();
			a1.add(n);
		}
		in.close();
		Vector<Integer> vector = new Vector<Integer>(a1);
		System.out.println("Converted Vector From List: " + vector);
	}

}
