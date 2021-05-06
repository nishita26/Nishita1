import java.util.Scanner;

public class ValidPhoneNumber {
	public static void main(String[] args) {
		System.out.print("Enter Your Mobile Number: ");
		Scanner in= new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		String regex = "(0/91)?[7-9][0-9]{9}";
		if(str.matches(regex)) {
			System.out.print("Given Mobile Number "+str+ " is valid");
			
		}
		else {
			System.out.print("Given Mobile Number "+str+ " is not valid");
		}
	}
}