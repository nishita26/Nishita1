//Program which takes 2 arguments - a string and its length. If the length of the string is not according to given one then throw the user defined LengthMatchException and handles it appropriately.
import java.util.*;
public class LengthmatchException {
	
	public static void validLength(String s,int l)throws InvalidLengthException{
		if(s.length()!=l)
		{
			System.out.print("Length are not same");
		}
		else
		{
			System.out.print("Length are same");
		}
	}
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=in.nextLine();
		System.out.print("Enter the length of entered string: ");
		int l=in.nextInt();
		in.close();
		
		try {
			validLength(s, l);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured "+e);
		}
			
	}
	class InvalidLengthException extends Exception{
		InvalidLengthException(String s)
		{
			super(s);
		}
	}
	

}
