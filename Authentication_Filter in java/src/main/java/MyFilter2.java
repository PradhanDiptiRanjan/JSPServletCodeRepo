

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter2
 */
@WebFilter("/MyFilter2")
public class MyFilter2 extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param resp 
	 * @param req 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain, ServletResponse resp, ServletRequest req) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
	  
		          
		    PrintWriter out=resp.getWriter();  
		          
		    String password=req.getParameter("password");  
		    if(password.equals("admin")){  
		    chain.doFilter(req, resp);//sends request to next resource  
		    }  
		    else{  
		    
		    RequestDispatcher rd=req.getRequestDispatcher("index.html");  
		    rd.include(req, resp); 
		    out.print("username or password error!"); 
		    
		    }  
		          
		}  

		//chain.doFilter(request, response);
	//}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
