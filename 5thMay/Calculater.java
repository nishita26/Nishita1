import java.util.*;
public class Calculater {

	public static void main(String[] args) {
		
	      int ch=0;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter two numbers: ");
	      double n1 = in.nextDouble();
	      double n2 = in.nextDouble();

	      System.out.println("1-for addition");
	      System.out.println("2-for subtraction");
	      System.out.println("3-for multiplication");
	      System.out.println("4-for division");
	      System.out.println("5-for modulo");
	      System.out.print("Enter Your Choice: ");
	      ch = in.nextInt();

	      switch(ch) {

	         case 1:
	            System.out.println("Result = "+ (n1+n2));
	            break;

			 case 2:
			    System.out.println("Result = "+ (n1-n2));
				break;
	
			 case 3:
			    System.out.println("Result = "+ (n1*n2));
				break;
	
			 case 4:
			    System.out.println("Result = "+ (n1/n2));
				break;
	
			 case 5:
			    System.out.println("Result = "+ (n1%n2));
				break;
	
			 default:
			    System.out.println("Invalid operator");
	      } 
	      in.close();

	}

}
