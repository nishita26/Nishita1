package seven_may_practicals;

import java.io.*;
public class BufferedReaderExample 
{
	public static void main(String args[])  throws IOException
	{
		try {
		FileReader fr=new FileReader("C:\\Users\\NISHITA\\Desktop\\Program\\demo.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int c;
		while((c=br.read())!=-1) {
			System.out.print((char)c);
		}
		br.close();
		fr.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
