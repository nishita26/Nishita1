package thirteen_may;
import java.io.*;

public class EmployeeSerilazation implements Serializable {
	
	private static final long serialVesionID=1L;
	int id;
	String name;
	double salary;
	
	EmployeeSerilazation(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	

	public static void main(String[] args) {
		try {
			EmployeeSerilazation e=new EmployeeSerilazation(1,"Nishi",50000);
			FileOutputStream fout=new FileOutputStream("C:\\Users\\NISHITA\\Desktop\\Program\\employee.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(e);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
