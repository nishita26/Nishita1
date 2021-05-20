package Eighteen_may;
import java.sql.*;


class DatabaseConnection {

	public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","2606");
        } catch (SQLException | ClassNotFoundException e) {
        }
        return connection;
    }

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","2606");
			System.out.println("Databse Connection Success");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

