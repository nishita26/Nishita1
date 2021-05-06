//Program to round off the given decimal number and store into String.
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
public class RoundOff {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.print("Enter the number:");
		double n=in.nextDouble();
		System.out.println("Round Off decimal number is "+ df.format(n));
		in.close();
	}
}



