package seven_may_practicals;
import java.io.*;
import java.util.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException{
		
		try {
			
			FileOutputStream fout=new FileOutputStream("C:\\Users\\NISHITA\\Desktop\\Program\\demo.txt");
			
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the string: ");
			String s=in.nextLine();
			byte b[]=s.getBytes();
			fout.write(b);
			
			fout.close();
			in.close();
			System.out.print("Write Successfully..");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}	

	}

}
