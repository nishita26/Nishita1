package seven_may_practicals;

import java.io.*;
import java.util.zip.*;
 
public class ZipFile {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sourceFile = "F:/movie.mkv";

		  // compressed file name
		  FileOutputStream fos = new FileOutputStream("F:/movie.zip");

		  System.out.println("File compression started.");
		  // output zip file stream.
		  ZipOutputStream zipOut = new ZipOutputStream(fos);
		  File fileToZip = new File(sourceFile);
		  FileInputStream fis = new FileInputStream(fileToZip);

		  // Creating zip file name.
		  ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		  zipOut.putNextEntry(zipEntry);

		  byte[] bytes = new byte[1024];
		  int length;

		  // writing content into zip or archieve file.
		  while ((length = fis.read(bytes)) >= 0) {
		   zipOut.write(bytes, 0, length);
		  }
		  zipOut.close();
		  fis.close();
		  fos.close();
		  System.out.println("Done");
	}
}

