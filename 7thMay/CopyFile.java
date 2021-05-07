package seven_may_practicals;

import java.io.*;
import java.util.*;
public class CopyFile {

	public static void main(String[] args) throws IOException{
		try {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter source file name: ");
			String sfile=in.nextLine();
			System.out.print("Enter the desitation file name: ");
			String dfile=in.nextLine();
			FileReader fin=new FileReader(sfile);
			FileWriter fout=new FileWriter(dfile,true);
			int i;
			while((i=fin.read()) != -1) {
				fout.write(i);
			}
			System.out.print("Copied Successfully...");
			in.close();
			fin.close();
			fout.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
