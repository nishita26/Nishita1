package Eighteen_may;

import java.sql.Connection;
import java.sql.*;
public class DeleteRecords{
	
	DatabaseConnection dc = new DatabaseConnection();
	public void deleteRecord()
	{
		try
		{
			Connection con = dc.getConnection();
			String del = "DELETE FROM customer";
			Statement st = con.createStatement();
			int i = st.executeUpdate(del);
			if(i>0)
			{
				System.out.println("Rows Deleted Successfully");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		DeleteRecords dr=new DeleteRecords();
		dr.deleteRecord();
		

	}

}
