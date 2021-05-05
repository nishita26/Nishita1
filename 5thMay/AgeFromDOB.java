import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeFromDOB {
	public int calcAge(LocalDate Dob)
    {
        LocalDate currentDate = LocalDate.now();
		int age = Period.between(Dob,currentDate).getYears();
        return age;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your birth date (yyyy-mm-dd): ");
        String dt = sc.nextLine();
        
        LocalDate Dob;
        Dob = LocalDate.parse(dt);    
        AgeFromDOB obj = new AgeFromDOB();
        int age = obj.calcAge(Dob);
        System.out.println("Your Age is "+age);
        sc.close();
	}

}
