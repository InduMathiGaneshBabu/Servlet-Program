

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String Password=request.getParameter("passwd");
		String Gender=request.getParameter("gender");
		
		out.println("<html><body><form>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><td>Username</td><td>:"+username+"</td></tr>");
		out.println("<tr><td>PassWord</td><td>:"+Password+"</td></tr>");
		out.println("<tr><td>Gender:</td><td>"+Gender+"</td></tr>");
		out.println("</table></form></body></html>");
		
	}

}
