import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FirstLetter {
	public static void main(String[] args) {
		System.out.print("Enter The String: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		String regex = "\\b[a-zA-Z]";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(str);
	    System.out.println("First letter of each word from the given string: ");
	    while(matcher.find())
	    {
	         System.out.print(matcher.group()+" ");
	    }
	}
}