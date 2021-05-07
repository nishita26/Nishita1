package seven_may_practicals;

import java.io.*;
public class AppendFile {

	public static void main(String[] args) throws IOException{
		try {
			File file=new File("C:\\Users\\NISHITA\\Desktop\\Program\\demo.txt");
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println("This is demo line1");
			pw.println("This is demo line2");
			
			pw.close();
			bw.close();
			fw.close();
			System.out.println("Data successfully append...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
