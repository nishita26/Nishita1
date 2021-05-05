//Program to find sum of n natural numbers with and without using loops
import java.util.Scanner;

public class NaturalNumber {
	static int sumOfNumber(int n)
	{
		if(n == 0)
			return 0;
		return n + sumOfNumber(n - 1);
	}

	public static void main(String[] args) {
		//Using loop	
		int  count, sum = 0;

        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        for(count = 1; count <= n; count++){
            sum = sum + count;
        }

        System.out.println("Sum of first "+n+" natural numbers using loop is: "+sum);
        
        //Without using loop
        System.out.println("Sum of first "+n+" natural numbers without using loop is " + sumOfNumber(n));      
	}

}

