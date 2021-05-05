//Program to find number is Palindrome number
import java.util.Scanner;

public class PalindromeNumber {
		  public static void main(String[] args) {
		    
		    int  reversedNum = 0, r;
		    
		    Scanner in= new Scanner(System.in);
			System.out.println("Enter any number:");
			int n=in.nextInt();
		    in.close();
		    
		    int originalNum = n;
		    
		    while (n != 0) {
		      r = n % 10;
		      reversedNum = reversedNum * 10 + r;
		      n /= 10;
		    }
		    
		    if (originalNum == reversedNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		    }
		  }
		}




