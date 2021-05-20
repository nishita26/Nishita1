package Eighteen_may;

import java.sql.*;
import java.util.*;

public class In_up_del_sel {
	
	DatabaseConnection dc=new DatabaseConnection();
	
	public void insert()
	{
		try
		{
			Connection con = dc.getConnection();
			String insert = "INSERT INTO USERS(id, Name, Age) VALUES (1,'Nishita', 24),(2,'Hetvi', 22),(3,'Neha', 30),(4,'Mausam', 45)";
			Statement st = con.createStatement();
			int i = st.executeUpdate(insert);
			if(i>0)
			{
				System.out.println(i+" Rows Added");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	
	public void update(int id,String name,int age)
	{
		try
		{
			Connection con=dc.getConnection();
			String up="UPDATE USERS SET Name=?, Age=? WHERE id=?";
			PreparedStatement pt=con.prepareStatement(up);
			pt.setString(1,name);
			pt.setInt(2,age);
			pt.setInt(3,id);
			int i=pt.executeUpdate();
			if(i>0)
				System.out.println("Record Update Successfully");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delete(int id_no)
	{
		try
		{
			Connection con = dc.getConnection();
			String del = "DELETE FROM USERS Where id=?";
			PreparedStatement ps = con.prepareStatement(del);
			ps.setInt(1, id_no);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Row Deleted Successfully");
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void select()
	{
		try
		{
			Connection con = dc.getConnection();
			String sel = "SELECT * FROM USERS";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sel);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("Name")+" Age: "+rs.getInt("Age"));
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}                                                                                                                                     
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("\n1-For Insert\n2-For Update\n3-For Delete\n4-For Select\nEnter the choice : ");
			int c = sc.nextInt();
			In_up_del_sel iuds = new In_up_del_sel();
			switch(c) {
			case 1:
				iuds.insert();
				break;
				
			case 2:
				iuds.select();
				System.out.print("Enter id of the record which you want to update: ");
				int id = sc.nextInt();
				System.out.print("\nPlease Enter New Age: ");
				int age = sc.nextInt();
				System.out.print("\nPlease Enter New Name: ");
				String name = sc.next();
				iuds.update(id, name, age);
				break;
				
			case 3:
				iuds.select();
				System.out.print("Please Enter id of the record which you want to delete: ");
				int id_no = sc.nextInt();
				iuds.delete(id_no);
				break;
				
			case 4:
				iuds.select();
				break;
				
				default:
					System.out.print("Enter Valid Choice");
					break;
			}
			
		}
	}
}