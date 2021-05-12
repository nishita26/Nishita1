package twelve_may;

import java.util.*;
public class SinglyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Linked List size: ");
		int size = in.nextInt();
		System.out.print("Enter elements: ");
		for(int i=0; i<size; i++)
		{
			String n = in.next();
			ll.add(n);
		}
		System.out.println("Linked List Elements Are: "+ll);
		in.close();
	}


}