//Program to find the factors of a given numbers
import java.util.Scanner;

public class Factor {

	public static void findFactor(int n) {
	       for(int i=1; i <= n; i++) {
	           if(n % i == 0)
	               System.out.println(i);
	       }
	   }
	public static void main(String[] args) {
		
		int num = 0;
	    
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    num = sc.nextInt();

	    System.out.println("The factors are: ");
	    findFactor(num);

	    sc.close();
	}
}

