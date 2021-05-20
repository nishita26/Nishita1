package Eighteen_may;

import java.sql.*;
public class ExecuteBatch {
	DatabaseConnection dc = new DatabaseConnection();
	public void addBatch()
	{
		try
		{
			Connection con = dc.getConnection();
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.addBatch("insert into customer(customer_id,customer_name,product_name) value (1,'Nishita','Soap')");
			st.addBatch("insert into customer(customer_id,customer_name,product_name) value (2,'Harsh','Oil')");
			st.addBatch("insert into customer(customer_id,customer_name,product_name) value (3,'Sonal','Shampoo')");
			st.executeBatch();
			con.commit();  
			con.close();  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecuteBatch eb = new ExecuteBatch();
		eb.addBatch();
		System.out.print("Records Added Successfully");
	}

}
