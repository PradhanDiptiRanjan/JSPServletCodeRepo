

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Enquery
 */
@WebServlet("/Enquery")
public class Enquery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enquery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","dipti143#");  
			Statement stmt=con.createStatement();
			String sqlquery="select balance from accout_open where account_no="+request.getParameter("acc");
			ResultSet rs=stmt.executeQuery(sqlquery);
		
			if(rs.next())
			{
				out.println("<h1 style=color:red;>"+rs.getFloat(1)+"</h1>");
			}
			else
			{
				out.println("<h1>Account number does not exist...</h1>");
			}
			rs.close();
			con.close();
			out.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
