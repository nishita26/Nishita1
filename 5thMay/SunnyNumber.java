//Program to find number is sunny number
import java.util.*;   
public class SunnyNumber {  
	public static void main(String args[])   
	{
		
	Scanner in = new Scanner(System.in);  
	System.out.print("Enter a number: ");  
	int n=in.nextInt();  
	
	isSunnyNumber(n);   
	}       
	 
	static boolean findPerfectSquare(double num)   
	{   
		double square_root = Math.sqrt(num);   
		return((square_root - Math.floor(square_root)) == 0);   
	}   
	
	static void isSunnyNumber(int n)   
	{   
		if (findPerfectSquare(n + 1))   
		{   
			System.out.println("The given number is a sunny number.");   
		}   
		else  
		{   
			System.out.println("The given number is not a sunny number.");   
		}   
	}   

}
