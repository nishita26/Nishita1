package seven_may_practicals;
import java.io.*;
import java.util.*;
public class BufferedWriterExample {
	public static void main(String args[]) throws IOException{
		try {
			FileWriter fw=new FileWriter("C:\\Users\\NISHITA\\Desktop\\Program\\demo.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the string: ");
			String s=in.nextLine();
			bw.write(s);
			
			in.close();
			bw.close();
			fw.close();
			System.out.print("Write Successfully...");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
