package Eighteen_may;
import java.sql.*;

public class SelectQuery {
	
		DatabaseConnection dc = new DatabaseConnection();
		public void select()
		{
			try
			{
				Connection con = dc.getConnection();
				String select = "SELECT * FROM USERS";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(select);
				while(rs.next())
				{
					System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("Name")+" And Age: "+rs.getInt("Age"));
				}
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			SelectQuery sq = new SelectQuery();
			sq.select();

		}

	}

