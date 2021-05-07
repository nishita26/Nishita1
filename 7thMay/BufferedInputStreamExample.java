package seven_may_practicals;

import java.io.*;
public class BufferedInputStreamExample 
{
	public static void main(String args[])  throws IOException
	{
		try {
		FileInputStream fin=new FileInputStream("C:\\Users\\NISHITA\\Desktop\\Program\\demo.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		
		int c;
		while((c=bin.read())!=-1) {
			System.out.print((char)c);
		}
		bin.close();
		fin.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	


