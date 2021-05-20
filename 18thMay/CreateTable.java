package Eighteen_may;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","2606");
				Statement st=con.createStatement();
				String sql="CREATE TABLE USERS(id INTEGER NOT NULL, Name Varchar(20) NOT NULL, Age INTEGER Not Null, PRIMARY KEY ( id ))";
				st.executeUpdate(sql);
				System.out.println("Table Created");
				con.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
	       
			}
			
		}
	

}
