package seven_may_practicals;
import java.io.*;
public class ReadOnlyFile {

	public static void main(String[] args) throws IOException {
		try {
			
			File file = new File("C:\\Users\\NISHITA\\Desktop\\Program\\newdemo.txt");
			if(file.setReadOnly()) {
				System.out.print("File successfully converted to Read only mode");
			}
			else {
				System.out.print("Opeartion failed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
