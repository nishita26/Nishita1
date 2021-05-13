package thirteen_may;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserilaztionEmployee {

	public static void main(String[] args) {
		try {
			
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\NISHITA\\Desktop\\Program\\employee.txt"));
			EmployeeSerilazation e=(EmployeeSerilazation)in.readObject();
			System.out.println(e.id+" "+e.name+" "+e.salary);
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
