import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = in.next();
		System.out.print("Enter Second String: ");
		String s2 = in.next();
		in.close();
		
		System.out.println("Before Swapping: "); 
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        
        System.out.println("After Swapping: ");
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
	}

}