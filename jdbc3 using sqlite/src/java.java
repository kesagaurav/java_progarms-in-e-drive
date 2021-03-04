import java.sql.*;

public class java {


	public static void connect()
	{
	Connection con;
	try {
		Class.forName("org.sqlite3.jdbc");
		 con=DriverManager.getConnection("jdbc:sqlite3:test.db");
		System.out.println("\n connected");
		con.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("error"+e);
	}
		
		//con.close();
	}
}