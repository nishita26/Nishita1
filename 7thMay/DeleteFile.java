package seven_may_practicals;

import java.io.*;
public class DeleteFile {

	public static void main(String[] args) {
		try {
			File file=new File("C:\\Users\\NISHITA\\Desktop\\Program\\delete.txt");
			if(file.delete())
				System.out.print(file.getName()+" Deleted");
			else
				System.out.print("failed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
