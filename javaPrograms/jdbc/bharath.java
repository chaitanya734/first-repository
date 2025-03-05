import java.sql.*;
class bharath{
	public static void main(String ars[])
	{
		String name="com.mysql.cj.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/collage";
		 String uname="root";
		 String pass="root";
		try {
		Class.forName(name);
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into student values(1,'hello',80)");
		con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
