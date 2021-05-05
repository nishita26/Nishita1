//Program to reverse the number
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		
		int reverse=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		in.close();
		
		while(n!=0)
		{
			int r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		System.out.println("The reverse of the given number is "+reverse);
	}
}
