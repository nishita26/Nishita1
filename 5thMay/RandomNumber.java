//Program to generate random number
import java.util.*;
public class RandomNumber {
   public static void main(String args[])
   {
	   Random r= new Random();
	   
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter min range: ");
	   int minRange=in.nextInt();
	   System.out.println("Enter max range: ");
	   int maxRange=in.nextInt();
	   int random_value= r.nextInt(maxRange-minRange)+minRange;
	   System.out.println("Random value is "+random_value);
	      
   }
}
