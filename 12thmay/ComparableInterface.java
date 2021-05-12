package twelve_may;

import java.util.*;

public class ComparableInterface {

	public static void main(String[] args) {
		
		Student st1 = new Student("Jayesh", 25, 25);
		   Student st2 = new Student("Rajesh", 15, 20);
		   Student st3 = new Student("Snehal", 20, 25);
		   
		   ArrayList<Student> al = new ArrayList<>();
		  
		   al.add(st1);
		   al.add(st2);
		   al.add(st3);
		 
		  System.out.println("Displaying student's name sorted by rollnos:");
		  Collections.sort(al); 
		  for(Student st:al){  
		       System.out.println(st.name+" "+st.rollno+" "+st.age);  
		   }
	}
}
