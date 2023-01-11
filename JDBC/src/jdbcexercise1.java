import java.sql.*;
public class jdbcexercise1 {

	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String passWord ="Realnandhagopal06@";
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from exercise1");
		while(rs.next())
		{
			System.out.println("ID is"+rs.getInt(1));
			System.out.println("name is "+rs.getString(2));
			System.out.println("gpa is"+rs.getInt(3));
		    
			}
		
		con.close();		
		

	}

}
