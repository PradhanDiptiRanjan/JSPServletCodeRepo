import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employ id");
			int id=sc.nextInt();
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","dipti143#");
			Statement st=con.createStatement();
			int record=st.executeUpdate("Delete from Emp_info where e_id="+id);
			if(record>0) {
				System.out.println(record+"Record deleted sucessfully......");
			}
			else {
				System.out.println("Employ does not exit");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
