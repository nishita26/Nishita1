package seven_may_practicals;

import java.io.*;
public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\NISHITA\\Desktop\\Program\\demo.txt");
		boolean result;
		try {
			result=file.createNewFile();
			if(result)
			{
				System.out.println("file created "+file.getCanonicalPath());
			}
			else
			{
				System.out.println("file already exist at location "+file.getCanonicalPath());
			}
		}
		catch(IOException e) {
			e.printStackTrace();;
		}
		

	}

}
