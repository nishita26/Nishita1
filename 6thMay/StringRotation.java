import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String s1=in.nextLine();
        
        System.out.println("Enter the string 2: ");
        String s2=in.nextLine();
        in.close();
		String s3 = s1 + s1;
		
		if(s3.contains(s2)) {
			System.out.println("s1 is rotation of s2");
		}
		else {
			System.out.println("s1 is not rotation of s2");
		}
	}

}