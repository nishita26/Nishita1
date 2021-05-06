import java.time.LocalDateTime;

public class CurrentDateAndTime {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();  
		System.out.println("Current Date and Time: "+date);
	}

}