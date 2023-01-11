
import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		sp2();
	}
	public static void readRecords() throws Exception {
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName="root";
		String passWord="Realnandhagopal06@";
		String query ="select * from employee";
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
		System.out.println("ID is"+rs.getInt(1));
		System.out.println("name is "+rs.getString(2));
		System.out.println("salary is"+rs.getInt(3));
		}
		con.close();

	}
	public static void insertQuery() throws SQLException{
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String passWord = "Realnandhagopal06@";
		String query = "insert into employee() values(4,'ramu',20000)";
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("no of rows affected"+rows);
		con.close();
		
	}
	public static void insertUsingpst() throws SQLException{
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String passWord = "Realnandhagopal06@";
		int id = 5;
		String name ="babu";
		int salary = 30000;
		String query = "insert into employee() values(?,?,?)";
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		PreparedStatement ps =con.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		int n = ps.executeUpdate();
		System.out.println("no of rows affected"+n);
		
		con.close();
		
	}
	public static void delete() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String password = "Realnandhagopal06@";
		int id = 5;
		String querry = "delete from employee where emp_id="+id;
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st =con.createStatement();
		int n =st.executeUpdate(querry);
		System.out.println("no of rows affected "+n);
		con.close();
	}
	public static void update() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String password = "Realnandhagopal06@";
		int id = 1;
		String querry = "update employee set salary=15000 where emp_id="+id;
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st =con.createStatement();
		int n =st.executeUpdate(querry);
		System.out.println("no of rows affected "+n);
	}
	//stored procedure
	public static void sp() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String password = "Realnandhagopal06@";
		Connection con= DriverManager.getConnection(url,userName,password);
		CallableStatement ct =con.prepareCall("{call getemp()}");
		ResultSet rs =ct.executeQuery();
		while(rs.next())
		{
		System.out.println("ID is"+rs.getInt(1));
		System.out.println("name is "+rs.getString(2));
		System.out.println("salary is"+rs.getInt(3));
		}
		con.close();
		
	}
	public static void sp2() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName ="root";
		String password = "Realnandhagopal06@";
		int id =3;
		Connection con= DriverManager.getConnection(url,userName,password);
		CallableStatement ct =con.prepareCall("{call getempbyid(?)}");
		ct.setInt(1, id);
		ResultSet rs =ct.executeQuery();
		ct.setInt(1, id);
		while(rs.next())
		{
		System.out.println("ID is"+rs.getInt(1));
		System.out.println("name is "+rs.getString(2));
		System.out.println("salary is"+rs.getInt(3));
		}
		con.close();
		
	}
	 

}
