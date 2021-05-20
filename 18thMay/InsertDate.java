package Eighteen_may;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class InsertDate {
	DatabaseConnection dc = new DatabaseConnection();
	public void date() {
		Connection c = dc.getConnection();
		try {
			PreparedStatement ps = c.prepareStatement("Insert into customer (id,name,product,date) values (?,?,?,?)");
			Date d = new Date(new java.util.Date().getTime());
			ps.setInt(1, 4);
			ps.setString(2, "Neha");
			ps.setString(3, "Toothpaste");
			ps.setDate(4, d);
			ps.executeUpdate();
			System.out.println("added successfully");
		} 
		catch (Exception e) {
			System.out.println("Exception occurred " + e);
		}
	}
	public static void main(String[] args) {
		InsertDate id = new InsertDate();
		id.date();
	}
}