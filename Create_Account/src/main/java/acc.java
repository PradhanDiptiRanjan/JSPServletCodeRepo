

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class acc
 */
@WebServlet("/acc")
public class acc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public acc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","dipti143#");  
			PreparedStatement ps=con.prepareStatement("insert into open_account values(?,?,?,?,?,?)");
			
			String name=request.getParameter("aname");
			int no=Integer.parseInt(request.getParameter("ac_no"));
			int slno=Integer.parseInt(request.getParameter("sl_no"));
			String opendate=request.getParameter("adt");
			String acctype=request.getParameter("atp");
			String balance=request.getParameter("abal");
			
			ps.setString(1, name);
			ps.setInt(2, no);
			ps.setInt(3, slno);
			ps.setString(4, opendate);
			ps.setString(5, acctype);
			ps.setString(6, balance);
			ps.executeUpdate();
			ps.close();
			con.close();
			
			
			
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<body bgcolor=gold>");
		pw.println("<h1 style=color:red;>Account Created Successfully....</h1>");
		pw.println("<a href=index.html>Do you want to Create Another account...</a>");
		pw.println("<body>");
		pw.close();
	}

}
