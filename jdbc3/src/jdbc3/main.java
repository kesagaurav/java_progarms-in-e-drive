package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/student";
		String user = "root";
		String password="1234";
		String query="select name from student where rollno=12";
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("url,user,password");
		System.out.println("con--->"+con); 
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("name");
		System.out.println(name);
		st.close();
		con.close();
		}
		catch(Exception e)
		{
		System.out.println("error"+e);
		}

		
		

	}

}
