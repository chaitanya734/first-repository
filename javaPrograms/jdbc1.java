package connection;
import java.sql.*;
import javax.sql.*;
class connection {
	public static void main(String agrgs[])
	{
		String name="com.mysql.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/school";
		 String uname="root";
		 String pass="root";
		try {
		Class.forName(name);
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into student values(1,'bhanu',80)");
		con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
