import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","dipti143#");
		Statement st=con.createStatement();
		int res=st.executeUpdate("insert into Emp_info values(108,'Dipti',20000000,'puri')" );
		System.out.println(res+"employ information sucessfully added.......");
		st.close();
		con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
