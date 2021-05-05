//Program to swap two numbers using bitwise operator
import java.util.Scanner;  
public class BitwiseSwap 
{  
	public static void main(String args[])  
	{  
 
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		int x = in.nextInt();  
		System.out.print("Enter the second number: ");  
		int y = in.nextInt();  
		System.out.println("Before swapping:");  
		System.out.println("a = " +x +", b = " +y);  
		x = x ^ y;  
		y = x ^ y;  
		x = x ^ y;  
		System.out.println("After swapping:");  
		System.out.print("a = " +x +", b = " +y);  
	}  
}  
