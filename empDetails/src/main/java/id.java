

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class id
 */
@WebServlet("/id")
public class id extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public id() {
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
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String salary=request.getParameter("salary");
		int n1=Integer.parseInt(id);
		int n2=Integer.parseInt(salary);
		float ta=n2*7/120;
		float da=n2*12/100;
		float hra=n2*23/200;
		float gross=ta+da+hra;
		out.println("<h1 style=color:blue>"+"Employ Name:"+name+"</h1>");
		out.println("<h1 style=color:red>"+"Employ ta:"+ta+"</h1>");
		out.println("<h1 style=color:orange>"+"Employ da:"+da+"</h1>");
		out.println("<h1 style=color:green>"+"Employ hra:"+hra+"</h1>");
		out.println("<h1 style=color:black>"+"Employ gross:"+gross+"</h1>");
		out.close();
	}

}
