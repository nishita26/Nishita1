package twelve_may;

import java.util.Collections;
import java.util.Vector;

public class BinarySearch {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(56);
		v.add(65);
		v.add(66);
		v.add(60);
		v.add(55);
		v.add(5);
		Collections.sort(v);
		System.out.println(v);
		int index= Collections.binarySearch(v,60);
		System.out.print("Element found at index: "+index);
		
		
		


	}

}
