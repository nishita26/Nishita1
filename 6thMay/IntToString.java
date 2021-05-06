//Program to convert the given integer values to the string
import java.util.*;
public class IntToString {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.print("Enter the number:");
		 int n=in.nextInt();
		 
		 String s=String.valueOf(n);
		 System.out.print("Value of Integer number is "+s);
		 in.close();

	}

}
