import java.sql.*;
import java.util.*;
import javax.sql.*;
class love {
	public static void main(String args[])
	{
		String url=System.getProperty("urlname");
		String uname=System.getProperty("name");
		String pass=System.getProperty("passname");

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the roll number");
            int roll = s.nextInt();
            s.nextLine();  // Consume the leftover newline

            System.out.println("Enter the name of buser");
            String buser = s.nextLine();  // Use nextLine to read the full line

            System.out.println("Enter commited or not");
            String names = s.nextLine();

            System.out.println("Enter the age number");
            int age = s.nextInt();
            s.nextLine();  // Consume the leftover newline

            System.out.println("Enter the name of guser");
            String guser = s.nextLine();  // Use nextLine to read the full line

			
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement stm = con.createStatement();
			String query="insert into lovecouple values("+roll+",'"+buser+"','"+guser+"','"+names+"',"+age+")";
			stm.executeLargeUpdate(query);
			String result="Select *from lovecouple";
			ResultSet res = stm.executeQuery(result);
			while(res.next()) {
			System.out.println(res.getInt(1) +"  "+res.getString(2) +"  "+ res.getString(3) +"  "+res.getString(4) +"  "+ res.getString(5));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
