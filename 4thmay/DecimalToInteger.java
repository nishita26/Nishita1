//Program to convert the given decimal number into integer
import java.util.*;
public class DecimalToInteger {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Decimal Number:");
		String decimalvalue=in.nextLine();
		in.close();
		
		int value=Integer.parseInt(decimalvalue);
		int i= Integer.valueOf(value).intValue();
		System.out.println("Integer number is: "+i);
		

	}

}
