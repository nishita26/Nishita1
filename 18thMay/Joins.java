package Eighteen_may;
import java.sql.*;
public class Joins {
	DatabaseConnection dc = new DatabaseConnection();
	
	public void innerJoin()
	{
		try
		{
			Connection con = dc.getConnection();
			String select = "SELECT id,name,dept_name FROM employee INNER JOIN department USING (dept_id)";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void leftJoin()
	{
		try
		{
			Connection con = dc.getConnection();
			String select = "SELECT id,name,dept_name FROM employee LEFT JOIN department USING (dept_id)";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" And Department: "+rs.getString(3));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void rightJoin()
	{
		try
		{
			Connection con = dc.getConnection();
			String select = "SELECT id,name,dept_name FROM employee RIGHT JOIN department USING (dept_id)";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fullJoin()
	{
		try
		{
			Connection con = dc.getConnection();
			String select = "SELECT id,name,dept_name FROM employee FULLOUTER JOIN department USING (dept_id)";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Joins j = new Joins();
		System.out.println("Inner Join");
		j.innerJoin();
		System.out.println();
		System.out.println("Left Join");
		j.leftJoin();
		System.out.println();
		System.out.println("Right Join");
		j.rightJoin();
		System.out.println();
		System.out.println("Full Outer Join");
		j.fullJoin();

	}

}
