import java.util.*;
public class FactorialNumber2 {
	static int factorail(int n)
	{
		if(n==0)
			return 1;
		else
		{
		 return(n*factorail(n-1));
		}
	}

	public static void main(String[] args) {
		
		int fact=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=in.nextInt();
		in.close();
		
		fact=factorail(n);
		System.out.println("Factorail of "+n+" is "+fact);
		
	}

}
