import java.util.Scanner;

public class Vowels_Consonants {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=in.nextLine();
        in.close();
	    int vowels = 0, consonants = 0;
	    
	    str=str.toLowerCase();
	    for (int i = 0; i < str.length(); i++) {
	    	char ch = str.charAt(i);
	    	
	    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            vowels++;
	        }
	    	
	    	else if ((ch >= 'a' && ch <= 'z')) {
	            consonants++;
	        }
	    }
	    
	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);	
	}

}