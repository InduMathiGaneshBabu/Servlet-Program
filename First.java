

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name="my own servlet",
		description="this is my first annotated servlet",
		urlPatterns= {"/First","/indu"}
		
		)
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("this is a first servlet");
	out.println("</body>");
	out.println("</html>");
	}

}
