//Program to find number is prime number
import java.util.Scanner;
	
public class PrimeNumber
{
	   public static void main(String args[])
	   {		
		
		boolean isPrime=true;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=in.nextInt();
	    in.close();
	    if(n<=1)
	    {
	    	isPrime=false;
	    	
	    }
		for(int i=2;i<=n/2;i++)
		{
	           
		   if(n%i==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(n + " is a Prime Number");
		else
		   System.out.println(n + " is not a Prime Number");
	   }
}


