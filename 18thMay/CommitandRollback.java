package Eighteen_may;
import java.sql.*;
public class CommitandRollback {
	public static void main(String[] args) throws SQLException {
		DatabaseConnection dc = new DatabaseConnection();
		Connection con = dc.getConnection();
		con.setAutoCommit(false);
		try
		{
		     Statement stmt=con.createStatement();
		     String query1="INSERT INTO department(dept_id,dept_name) VALUES(60,'Designing')";
		     stmt.executeUpdate(query1);
		     String query2="INSERT INTO employee(name,id,dept_id) VALUES('Harsh',5,60)";
		     stmt.executeUpdate(query2);
		     con.commit();
		     System.out.println("Row Inserted");
		     
		 } 
		 catch (SQLException e) 
		 {
		     con.rollback();
		     e.printStackTrace();
		     con.close();
		 }
	}

	

}
