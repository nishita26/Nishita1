package seven_may_practicals;

import java.io.*;

public class RenameFile {
   public static void main(String[] args) {
      File oldName = new File("C:\\Users\\NISHITA\\Desktop\\Program\\rename.txt");
      File newName = new File("C:\\Users\\NISHITA\\Desktop\\Program\\newdemo.txt");
      
      if(oldName.renameTo(newName)){
         System.out.println("renamed");
      } else {
         System.out.println("Error");
      }
   }
}
