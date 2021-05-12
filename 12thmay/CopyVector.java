package twelve_may;

import java.util.Scanner;
import java.util.Vector;

public class CopyVector {

	public static void main(String[] args) {
		
		Vector <String> main = new Vector <String> ();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter vector size: ");
		int size = in.nextInt();
		System.out.print("Enter numbers: ");
		for(int i=1; i<=size; i++)
		{
			String n = in.next();
			main.add(n);
		}
		in.close();
		Object copied = main.clone();
		System.out.print("Main Vector: "+main);
		System.out.print("\nCopied Vector: "+copied);
	}

}