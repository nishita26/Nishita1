import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTimePattern {

	public static void main(String[] args) {
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");  
		LocalDateTime dt = LocalDateTime.now();  
		System.out.println("Current date and time in DD:MM:YYYY hh:mm:ss format: "+date.format(dt));
	}

}