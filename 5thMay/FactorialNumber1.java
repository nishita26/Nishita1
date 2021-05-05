import java.util.Scanner;
public class FactorialNumber1 {
	public static void main(String args[]) {
		
		int fact=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=in.nextInt();
		in.close();
		
		for(int i=1;i<=n;i++)
			fact=fact*i;
		
		System.out.println("Factorail of "+n+" is "+fact);
			
	}

}
